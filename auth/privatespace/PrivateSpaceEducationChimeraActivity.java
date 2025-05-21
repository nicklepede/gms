package com.google.android.gms.auth.privatespace;

import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.adlg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PrivateSpaceEducationChimeraActivity extends adlg {
    private final void b(int i, int i2) {
        int dimension = (int) getResources().getDimension(R.dimen.ps_bullet_gap_width);
        TextView textView = (TextView) findViewById(i);
        SpannableString spannableString = new SpannableString(getResources().getString(i2));
        spannableString.setSpan(new BulletSpan(dimension), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "PrivateSpaceEducationActivity";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b0, code lost:
    
        r5 = getWindow().getDecorView().getWindowInsetsController();
     */
    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r5 = 2131624200(0x7f0e0108, float:1.8875573E38)
            r4.setContentView(r5)
            r5 = 2131429716(0x7f0b0954, float:1.8481113E38)
            r0 = 2132083279(0x7f15024f, float:1.9806696E38)
            r4.b(r5, r0)
            r5 = 2131427805(0x7f0b01dd, float:1.8477237E38)
            r0 = 2132083276(0x7f15024c, float:1.980669E38)
            r4.b(r5, r0)
            r5 = 2131428115(0x7f0b0313, float:1.8477865E38)
            r0 = 2132083277(0x7f15024d, float:1.9806692E38)
            r4.b(r5, r0)
            r5 = 2131428783(0x7f0b05af, float:1.847922E38)
            r0 = 2132083278(0x7f15024e, float:1.9806694E38)
            r4.b(r5, r0)
            r5 = 2131430695(0x7f0b0d27, float:1.8483098E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            fkli r0 = defpackage.fkli.a
            fklj r0 = r0.a()
            java.lang.String r0 = r0.a()
            r1 = 2132083283(0x7f150253, float:1.9806704E38)
            java.lang.String r1 = r4.getString(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "<a href=\"%s\">%s</a>"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            boolean r2 = defpackage.asqh.a()
            if (r2 == 0) goto L63
            r2 = 63
            android.text.Spanned r1 = defpackage.aju$$ExternalSyntheticApiModelOutline0.m(r1, r2)
            goto L67
        L63:
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
        L67:
            r5.setText(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r5.setMovementMethod(r1)
            r5 = 2131432733(0x7f0b151d, float:1.8487232E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            adjx r1 = defpackage.adjx.c
            android.content.Intent r2 = r4.getIntent()
            java.lang.Object r1 = r1.j(r2)
            adjt r1 = (defpackage.adjt) r1
            boolean r1 = r1.a
            r2 = 8
            if (r1 == 0) goto L95
            acbu r1 = new acbu
            r1.<init>()
            r5.setOnClickListener(r1)
            goto L98
        L95:
            r5.setVisibility(r2)
        L98:
            r5 = 2131431224(0x7f0b0f38, float:1.8484171E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            acbv r1 = new acbv
            r1.<init>()
            r5.setOnClickListener(r1)
            boolean r5 = defpackage.asqh.g()
            if (r5 != 0) goto Lb0
            goto Lc8
        Lb0:
            android.view.Window r5 = r4.getWindow()
            android.view.View r5 = r5.getDecorView()
            android.view.WindowInsetsController r5 = defpackage.dah$$ExternalSyntheticApiModelOutline0.m(r5)
            if (r5 == 0) goto Lc8
            boolean r1 = defpackage.arkc.k(r4)
            if (r0 == r1) goto Lc5
            r3 = r2
        Lc5:
            defpackage.ahs$$ExternalSyntheticApiModelOutline0.m(r5, r3, r2)
        Lc8:
            fkdo r5 = defpackage.fkdo.a
            fkdp r5 = r5.a()
            boolean r5 = r5.m()
            if (r5 == 0) goto Ld6
            int r5 = defpackage.ips.a
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.privatespace.PrivateSpaceEducationChimeraActivity.onCreate(android.os.Bundle):void");
    }
}
