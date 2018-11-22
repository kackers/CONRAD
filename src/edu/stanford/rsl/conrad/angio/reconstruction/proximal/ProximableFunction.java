package edu.stanford.rsl.conrad.angio.reconstruction.proximal;

import java.util.ArrayList;

import edu.stanford.rsl.conrad.data.numeric.MultiChannelGrid3D;

public abstract class ProximableFunction {

	public abstract float evaluate(ArrayList<MultiChannelGrid3D> x);
	
	public abstract void evaluateProx(ArrayList<MultiChannelGrid3D> x, ArrayList<MultiChannelGrid3D> xProx, float tau);
	
	public abstract void evaluateConjugateProx(ArrayList<MultiChannelGrid3D> x, ArrayList<MultiChannelGrid3D> xProx, float tau);
}
