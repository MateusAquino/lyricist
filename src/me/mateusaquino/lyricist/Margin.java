/* Lyricist - Lyrics video maker

MIT License

Copyright (c) 2019 Mateus de Aquino Batista

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.*/

package me.mateusaquino.lyricist;

/**
 * Margin of the elements on the track.
 * <br>Obs: I like using (10, 0, 0, 0) for texts :)
 * 
 * @author Mateus de Aquino Batista
 * @category Main Elements
 */
public final class Margin {
	private int top, right, bottom, left;
	public Margin(int top, int right, int bottom, int left){
		this.top = top;
		this.right = right;
		this.bottom = bottom;
		this.left = left;
	}
	
	public int left() {
		return left;
	}
	
	public int top() {
		return top;
	}

	public int right() {
		return right;
	}
	
	public int bottom() {
		return bottom;
	}
}