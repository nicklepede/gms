package com.google.android.gms.constellation.ui.debug;

import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.arxo;
import defpackage.asqh;
import defpackage.asze;
import defpackage.atlk;
import defpackage.atlw;
import defpackage.atmc;
import defpackage.atmg;
import defpackage.byhr;
import defpackage.eijm;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fefi;
import defpackage.fjra;
import defpackage.fmms;
import defpackage.qet;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConstellationDebugChimeraActivity extends qet {
    public static final arxo j = atmg.a("debug_activity");
    private Button A;
    private Button B;
    private Button C;
    private Button D;
    private Button E;
    private Button F;
    private Button G;
    private Button H;
    private Button I;
    private Button J;
    private Button K;
    private Button L;
    private Button M;
    private Button N;
    private Button O;
    private Button P;
    private Button Q;
    private Button R;
    private Button S;
    private Button T;
    private Button U;
    private Button V;
    private Button W;
    private Button X;
    private Button Y;
    private Button Z;
    private Button aa;
    private Button ab;
    public final Handler k = new byhr();
    public atlw l;
    public Button m;
    public TextView n;
    public EditText o;
    public EditText p;
    public String q;
    public ArrayList r;
    public asze s;
    public atmc t;
    public eijm u;
    private Button v;
    private Button w;
    private Button x;
    private Button y;
    private Button z;

    public static final fjra p(String str) {
        fecj v = fjra.a.v();
        feay A = feay.A(str);
        if (!v.b.L()) {
            v.U();
        }
        ((fjra) v.b).c = A;
        fefi c = atlk.c(System.currentTimeMillis());
        if (!v.b.L()) {
            v.U();
        }
        fjra fjraVar = (fjra) v.b;
        c.getClass();
        fjraVar.d = c;
        fjraVar.b |= 1;
        return (fjra) v.Q();
    }

    public final atmc a(String str) {
        atmc atmcVar = new atmc(str);
        atmcVar.f = this.q;
        atmcVar.g = this.r;
        atmcVar.c = 6;
        return atmcVar;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof TextView) {
                Rect rect = new Rect();
                currentFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    currentFocus.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void k(boolean z) {
        this.A.setEnabled(z);
        this.B.setEnabled(z);
        this.C.setEnabled(z);
        this.E.setEnabled(z);
        this.X.setEnabled(z);
        this.ab.setEnabled(z);
        if (!z || fmms.a.a().k()) {
            this.v.setEnabled(z);
            this.F.setEnabled(z);
            this.H.setEnabled(z);
            this.I.setEnabled(z);
            this.J.setEnabled(z);
            this.K.setEnabled(z);
            this.L.setEnabled(z);
            this.M.setEnabled(z);
            this.N.setEnabled(z);
            this.O.setEnabled(z);
            this.P.setEnabled(z);
            this.Q.setEnabled(z);
            this.R.setEnabled(z);
            this.S.setEnabled(z);
            if (asqh.c()) {
                this.T.setEnabled(z);
                this.U.setEnabled(z);
            } else {
                this.T.setEnabled(false);
                this.U.setEnabled(false);
            }
            this.V.setEnabled(z);
            this.W.setEnabled(z);
        }
        if (z && TextUtils.isEmpty(this.q)) {
            return;
        }
        this.y.setEnabled(z);
        this.z.setEnabled(z);
        this.w.setEnabled(z);
        this.x.setEnabled(z);
    }

    public final void l(boolean z) {
        Settings.Global.putInt(getContentResolver(), "airplane_mode_on", z ? 1 : 0);
    }

    public final void m(boolean z) {
        ((TelephonyManager) getSystemService("phone")).setDataEnabled(z);
    }

    public final void n(boolean z) {
        ((WifiManager) getApplicationContext().getSystemService("wifi")).setWifiEnabled(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0349 A[SYNTHETIC] */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.constellation.ui.debug.ConstellationDebugChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
