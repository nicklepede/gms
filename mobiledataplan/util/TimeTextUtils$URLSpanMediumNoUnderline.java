package com.google.android.gms.mobiledataplan.util;

import android.text.TextPaint;
import android.text.style.URLSpan;
import defpackage.chab;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TimeTextUtils$URLSpanMediumNoUnderline extends URLSpan {
    public TimeTextUtils$URLSpanMediumNoUnderline(String str) {
        super(str);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(chab.a);
    }
}
