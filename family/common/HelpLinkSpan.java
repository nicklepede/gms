package com.google.android.gms.family.common;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import defpackage.bbud;
import defpackage.bktr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class HelpLinkSpan extends URLSpan {
    private final String a;
    private final String b;
    private final String c;
    private final bbud d;

    public HelpLinkSpan(bbud bbudVar, String str, String str2, String str3) {
        super(str2);
        this.d = bbudVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        GoogleHelp googleHelp = new GoogleHelp(this.a);
        googleHelp.q = Uri.parse(this.b);
        googleHelp.c = new Account(this.c, "com.google");
        TypedValue typedValue = new TypedValue();
        bbud bbudVar = this.d;
        if (bbudVar.getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.a = R.style.Theme_FamilyManagement;
            themeSettings.b = typedValue.data;
            googleHelp.s = themeSettings;
        }
        new bktr((Activity) bbudVar.getContext()).a(googleHelp.a());
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
