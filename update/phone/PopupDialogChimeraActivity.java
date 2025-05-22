package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.auad;
import defpackage.djol;
import defpackage.djqa;
import defpackage.djuy;
import defpackage.djuz;
import defpackage.djwi;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekwo;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.endj;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.ftpm;
import defpackage.ryt;
import j$.time.Duration;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PopupDialogChimeraActivity extends ryt {
    public CountDownTimer k;
    public ekvi l = ektg.a;
    public TextView m;
    public Button n;
    public Button o;
    public Button p;
    private djuy r;
    private String s;
    private elhz t;
    private djwi u;
    private TextView v;
    private boolean w;
    private int x;
    private static final long q = TimeUnit.SECONDS.toMillis(60);
    public static final auad j = djuz.h("PopupDialogChimeraActivity");

    private static final void f() {
        ftpm.a.lK().a();
    }

    public final void a(int i) {
        if (this.t.contains(Integer.valueOf(i))) {
            fgrc v = endj.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            endj endjVar = (endj) fgriVar;
            endjVar.b |= 1;
            endjVar.c = i;
            String str = this.s;
            if (!fgriVar.L()) {
                v.U();
            }
            endj endjVar2 = (endj) v.b;
            str.getClass();
            endjVar2.b |= 2;
            endjVar2.d = str;
            this.r.e((endj) v.Q());
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
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        CountDownTimer countDownTimer = this.k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.u != null) {
            djol.a(this).bo(this.u);
        }
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        if (getIntent().getIntExtra("type", -1) == 1) {
            a(17);
        }
        super.onPause();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        this.s = String.valueOf(SystemClock.elapsedRealtime());
        elhx elhxVar = new elhx();
        for (String str : ekwo.e(',').i().d().l(djqa.k())) {
            try {
                elhxVar.c(Integer.valueOf(str));
            } catch (NumberFormatException unused) {
                j.m("Failed to parse Ui event code: %s.", str);
            }
        }
        this.t = elhxVar.g();
        if (getIntent().getIntExtra("type", -1) == 3) {
            a(20);
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.l.h()) {
            bundle.putLong("remaining_reboot_countdown_seconds", ((Duration) this.l.c()).toSeconds());
        } else {
            bundle.remove("remaining_reboot_countdown_seconds");
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void setTitle(int i) {
        f();
        if (this.x == 3 && this.w) {
            this.v.setText(i);
        } else {
            super.setTitle(i);
        }
    }
}
