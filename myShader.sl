surface

myShader ( float Ka = 1, Kd = 1, frequency = 0.5; float noiseFreq = 50;
	    color darkcolor = color "rgb" (0.7,0.5,0.4); color otha = color "rgb" (0.69,0.63,.51); color other = color "rgb" (0.2, 0.18, 0.16);color culur = color "rgb" (.9,0.85,0.75);
    )
{
  
  float smod, xp, yp, zp, noise;
  point newP = transform("camera",P);
  noise = noise(transform("shader",P*noiseFreq));
  xp = xcomp(newP*noise);
  yp = ycomp(newP*noise);
  zp = zcomp(newP*noise);
 
  
  smod = mod(s,frequency);
  smod = mod(xp,1*frequency*noise);
  if(smod<0.25*frequency*noise)
	Ci = otha;
  else if(smod<0.5*frequency && smod >= 0.25*frequency) 
       Ci = otha;
  else if(smod<0.75*frequency && smod >= 0.5*frequency)
       Ci = culur;
  else
	Ci = culur;

	
  
  float change;

  change = smoothstep(0.4*frequency, 0.6*frequency, smod);

  newP = 2.2 * change * normalize(N)*noise + P;

  normal N = calculatenormal(newP);


	
	
  Oi = Os;
  Ci = Oi * Ci * (Ka * ambient() + 
		  Kd*diffuse(faceforward(normalize(N),I)));
}