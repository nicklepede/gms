package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DefensiveURLSpan extends URLSpan {
    private static final ausn a = zsi.a("DefensiveURLSpan");
    private final boolean b;

    public DefensiveURLSpan(String str, boolean z) {
        super(str);
        this.b = z;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        try {
            super.onClick(view);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(view.getContext(), view.getResources().getString(R.string.common_no_browser_found), 1).show();
            ((eluo) ((eluo) a.i()).s(e)).x("Cannot find the activity.");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.b);
    }
}
