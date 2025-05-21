package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.arxo;
import defpackage.dhdf;
import defpackage.dheu;
import defpackage.dhjs;
import defpackage.dhjt;
import defpackage.dhlc;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eijj;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ekpx;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fqvq;
import defpackage.qfp;
import j$.time.Duration;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PopupDialogChimeraActivity extends qfp {
    public CountDownTimer k;
    public eiid l = eigb.a;
    public TextView m;
    public Button n;
    public Button o;
    public Button p;
    private dhjs r;
    private String s;
    private eiuu t;
    private dhlc u;
    private TextView v;
    private boolean w;
    private int x;
    private static final long q = TimeUnit.SECONDS.toMillis(60);
    public static final arxo j = dhjt.h("PopupDialogChimeraActivity");

    private static final void f() {
        fqvq.a.a().a();
    }

    public final void a(int i) {
        if (this.t.contains(Integer.valueOf(i))) {
            fecj v = ekpx.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            ekpx ekpxVar = (ekpx) fecpVar;
            ekpxVar.b |= 1;
            ekpxVar.c = i;
            String str = this.s;
            if (!fecpVar.L()) {
                v.U();
            }
            ekpx ekpxVar2 = (ekpx) v.b;
            str.getClass();
            ekpxVar2.b |= 2;
            ekpxVar2.d = str;
            this.r.e((ekpx) v.Q());
        }
    }

    public final void b(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (parseUri.resolveActivity(getPackageManager()) != null) {
                startActivity(parseUri);
            } else {
                j.m(a.x(str, "No activity is able to handle the uri: "), new Object[0]);
            }
        } catch (URISyntaxException unused) {
            j.f("Invalid url syntax: ".concat(String.valueOf(str)), new Object[0]);
        }
    }

    public final void c() {
        this.m.setText(R.string.system_update_countdown_complete);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0258  */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.phone.PopupDialogChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        CountDownTimer countDownTimer = this.k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.u != null) {
            dhdf.a(this).bp(this.u);
        }
        super.onDestroy();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        if (getIntent().getIntExtra("type", -1) == 1) {
            a(17);
        }
        super.onPause();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        this.s = String.valueOf(SystemClock.elapsedRealtime());
        eius eiusVar = new eius();
        for (String str : eijj.e(',').i().d().l(dheu.k())) {
            try {
                eiusVar.c(Integer.valueOf(str));
            } catch (NumberFormatException unused) {
                j.m("Failed to parse Ui event code: %s.", str);
            }
        }
        this.t = eiusVar.g();
        if (getIntent().getIntExtra("type", -1) == 3) {
            a(20);
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.l.h()) {
            bundle.putLong("remaining_reboot_countdown_seconds", ((Duration) this.l.c()).toSeconds());
        } else {
            bundle.remove("remaining_reboot_countdown_seconds");
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void setTitle(int i) {
        f();
        if (this.x == 3 && this.w) {
            this.v.setText(i);
        } else {
            super.setTitle(i);
        }
    }
}
