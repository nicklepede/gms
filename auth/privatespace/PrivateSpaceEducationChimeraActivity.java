package com.google.android.gms.auth.privatespace;

import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.afln;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PrivateSpaceEducationChimeraActivity extends afln {
    private final void b(int i, int i2) {
        int dimension = (int) getResources().getDimension(R.dimen.ps_bullet_gap_width);
        TextView textView = (TextView) findViewById(i);
        SpannableString spannableString = new SpannableString(getResources().getString(i2));
        spannableString.setSpan(new BulletSpan(dimension), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "PrivateSpaceEducationActivity";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b0, code lost:
    
        r5 = getWindow().getDecorView().getWindowInsetsController();
     */
    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r5 = 2131624201(0x7f0e0109, float:1.8875575E38)
            r4.setContentView(r5)
            r5 = 2131429725(0x7f0b095d, float:1.848113E38)
            r0 = 2132083276(0x7f15024c, float:1.980669E38)
            r4.b(r5, r0)
            r5 = 2131427806(0x7f0b01de, float:1.8477239E38)
            r0 = 2132083273(0x7f150249, float:1.9806684E38)
            r4.b(r5, r0)
            r5 = 2131428118(0x7f0b0316, float:1.8477871E38)
            r0 = 2132083274(0x7f15024a, float:1.9806686E38)
            r4.b(r5, r0)
            r5 = 2131428790(0x7f0b05b6, float:1.8479234E38)
            r0 = 2132083275(0x7f15024b, float:1.9806688E38)
            r4.b(r5, r0)
            r5 = 2131430718(0x7f0b0d3e, float:1.8483145E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            fnbx r0 = defpackage.fnbx.a
            fnby r0 = r0.lK()
            java.lang.String r0 = r0.a()
            r1 = 2132083280(0x7f150250, float:1.9806698E38)
            java.lang.String r1 = r4.getString(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "<a href=\"%s\">%s</a>"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            boolean r2 = defpackage.auub.a()
            if (r2 == 0) goto L63
            r2 = 63
            android.text.Spanned r1 = defpackage.akd$$ExternalSyntheticApiModelOutline0.m(r1, r2)
            goto L67
        L63:
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
        L67:
            r5.setText(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r5.setMovementMethod(r1)
            r5 = 2131432766(0x7f0b153e, float:1.8487299E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            afke r1 = defpackage.afke.c
            android.content.Intent r2 = r4.getIntent()
            java.lang.Object r1 = r1.j(r2)
            afka r1 = (defpackage.afka) r1
            boolean r1 = r1.a
            r2 = 8
            if (r1 == 0) goto L95
            aebu r1 = new aebu
            r1.<init>()
            r5.setOnClickListener(r1)
            goto L98
        L95:
            r5.setVisibility(r2)
        L98:
            r5 = 2131431250(0x7f0b0f52, float:1.8484224E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            aebv r1 = new aebv
            r1.<init>()
            r5.setOnClickListener(r1)
            boolean r5 = defpackage.auub.g()
            if (r5 != 0) goto Lb0
            goto Lc8
        Lb0:
            android.view.Window r5 = r4.getWindow()
            android.view.View r5 = r5.getDecorView()
            android.view.WindowInsetsController r5 = defpackage.hdh$$ExternalSyntheticApiModelOutline0.m(r5)
            if (r5 == 0) goto Lc8
            boolean r1 = defpackage.atmr.k(r4)
            if (r0 == r1) goto Lc5
            r3 = r2
        Lc5:
            defpackage.aib$$ExternalSyntheticApiModelOutline0.m(r5, r3, r2)
        Lc8:
            fmua r5 = defpackage.fmua.a
            fmub r5 = r5.lK()
            boolean r5 = r5.n()
            if (r5 == 0) goto Ld6
            int r5 = defpackage.iri.a
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.privatespace.PrivateSpaceEducationChimeraActivity.onCreate(android.os.Bundle):void");
    }
}
