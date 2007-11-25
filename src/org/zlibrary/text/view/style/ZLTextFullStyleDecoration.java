package org.zlibrary.text.view.style;

import org.zlibrary.core.options.*;
import org.zlibrary.core.options.util.*;

import org.zlibrary.text.view.ZLTextStyle;

import org.zlibrary.text.model.ZLTextAlignmentType;
import org.zlibrary.text.model.entry.*;

public class ZLTextFullStyleDecoration extends ZLTextStyleDecoration {
	public ZLIntegerRangeOption SpaceBeforeOption;	
	public ZLIntegerRangeOption SpaceAfterOption;		
	public ZLIntegerRangeOption LeftIndentOption;	
	public ZLIntegerRangeOption RightIndentOption;
	public ZLIntegerRangeOption FirstLineIndentDeltaOption;

	public ZLIntegerOption AlignmentOption;

	public ZLDoubleOption LineSpaceOption;	

	public ZLTextFullStyleDecoration(ZLTextControlEntry entry) {
		super(entry);
	}
	
	public ZLTextFullStyleDecoration(String name, int fontSizeDelta, ZLBoolean3 bold, ZLBoolean3 italic, int spaceBefore, int spaceAfter, int leftIndent,int rightIndent, int firstLineDelta, int verticalShift, ZLTextAlignmentType alignment, double lineSpace, ZLBoolean3 allowHyphenations) {
		super(name, fontSizeDelta, bold, italic, verticalShift, allowHyphenations);
		SpaceBeforeOption = null;
		SpaceAfterOption = null;
		LeftIndentOption = null;
		RightIndentOption = null;
		FirstLineIndentDeltaOption = null;
		AlignmentOption = null;
		LineSpaceOption = null;
	}

	public boolean isFullDecoration() {
		return true;
	}

	public ZLTextStyle createDecoratedStyle(ZLTextStyle base) {
		return new ZLTextFullDecoratedStyle(base, this);
	}
}