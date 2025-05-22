package com.google.android.gms.common.ui;

import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class URLSpanNoUnderline extends URLSpan {
    public URLSpanNoUnderline(String str) {
        super(str);
    }

    public static Spannable a(Spanned spanned) {
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(spanned);
        for (URLSpan uRLSpan : (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class)) {
            int spanStart = newSpannable.getSpanStart(uRLSpan);
            int spanEnd = newSpannable.getSpanEnd(uRLSpan);
            newSpannable.removeSpan(uRLSpan);
            newSpannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return newSpannable;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
