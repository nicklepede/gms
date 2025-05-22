package com.google.android.gms.wallet.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import defpackage.atzb;
import defpackage.bp;
import defpackage.bsxe;
import defpackage.dkqh;
import defpackage.dkql;
import defpackage.dksm;
import defpackage.dkst;
import defpackage.dksv;
import defpackage.dktm;
import defpackage.dkxw;
import defpackage.dkyr;
import defpackage.dlgd;
import defpackage.egag;
import defpackage.egan;
import defpackage.egdh;
import defpackage.eghe;
import defpackage.eghz;
import defpackage.egig;
import defpackage.egjg;
import defpackage.egji;
import defpackage.egrg;
import defpackage.egry;
import defpackage.ehxb;
import defpackage.ehxf;
import defpackage.eicc;
import defpackage.eide;
import defpackage.eidk;
import defpackage.ekvl;
import defpackage.fdcc;
import defpackage.fdmr;
import defpackage.febx;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgtg;
import defpackage.fvqg;
import defpackage.fvsj;
import defpackage.fvtg;
import defpackage.fvyq;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fyea;
import defpackage.fyeb;
import defpackage.ing;
import defpackage.iwv;
import defpackage.rxx;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GenericDelegatorChimeraActivityX extends rxx {
    private static final Set j = Collections.singleton("com.google.android.gms.firstparty.ACTION_BENDER3");
    private dkqh k;

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        dkqh dkqhVar = this.k;
        egjg.a();
        Boolean bool = null;
        if (accessibilityEvent.getEventType() == 32 && dksm.v(((dksm) dkqhVar).b)) {
            bool = Boolean.FALSE;
        }
        return bool != null ? bool.booleanValue() : super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        Intent d;
        egan eganVar;
        dkqh dkqhVar = this.k;
        if (i == 600) {
            egdh O = dlgd.O(((dksm) dkqhVar).a);
            egjg.a();
            Intent e = fvqg.c() ? egan.e(egan.c(i2)) : egan.e(0);
            e.putExtra("resultCode", i2);
            if (intent != null) {
                e.putExtra("resultData", intent);
            }
            O.J(new egan(e));
            return;
        }
        if (i == 900) {
            dlgd.O(((dksm) dkqhVar).a).P(i2, intent);
            return;
        }
        if (i == 1000) {
            egdh O2 = dlgd.O(((dksm) dkqhVar).a);
            if (i2 == -1) {
                d = egan.e(0);
            } else {
                d = egan.d(intent != null ? eghz.a(intent.getIntExtra("tokenization_result_code", -1)) : 0);
            }
            O2.J(new egan(d));
            return;
        }
        febx febxVar = null;
        if (i != 1100) {
            if (i != 800 && i != 801) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            if (fvtg.d() && i2 == 0) {
                if (intent == null) {
                    intent = null;
                } else if (intent.hasExtra("errorCode")) {
                    dlgd.O(((dksm) dkqhVar).a).J(egan.k(intent.getIntExtra("errorCode", 0)));
                    return;
                }
            }
            String dataString = intent != null ? intent.getDataString() : null;
            egdh O3 = dlgd.O(((dksm) dkqhVar).a);
            Intent e2 = egan.e(0);
            e2.putExtra("resultUrl", dataString);
            O3.J(new egan(e2));
            return;
        }
        egdh O4 = dlgd.O(((dksm) dkqhVar).a);
        if (i2 == -1) {
            eganVar = new egan(egan.e(0));
            egjg.a();
            if (intent != null && intent.hasExtra("new_card_info")) {
                CardInfo cardInfo = (CardInfo) ing.a(intent, "new_card_info", CardInfo.class);
                if (cardInfo != null) {
                    fgrc v = febx.a.v();
                    fxxm.f(v, "builder");
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    febx febxVar2 = (febx) fgriVar;
                    febxVar2.b = 1 | febxVar2.b;
                    febxVar2.c = cardInfo.E;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    long j2 = cardInfo.B;
                    febx febxVar3 = (febx) v.b;
                    febxVar3.b |= 2;
                    febxVar3.d = j2;
                    fgri Q = v.Q();
                    fxxm.e(Q, "build(...)");
                    febxVar = (febx) Q;
                }
                if (febxVar != null) {
                    egig.q(eganVar.a, "cardInfo", febxVar);
                }
            }
        } else {
            eganVar = new egan(egan.d(intent != null ? eghz.a(intent.getIntExtra("tokenization_result_code", -1)) : 0));
        }
        O4.J(eganVar);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        ((dksm) this.k).b.a();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [eqgl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [eqgl, java.lang.Object] */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Bundle c;
        byte[] byteArrayExtra;
        int a;
        String action = getIntent().getAction();
        atzb.t(action, "Intent action must not be null");
        Set set = j;
        set.contains(action);
        if (!set.contains(action)) {
            throw new SecurityException("This action can't be handled through a non exported activity.");
        }
        if (action.hashCode() == 1039885492 && action.equals("com.google.android.gms.firstparty.ACTION_BENDER3")) {
            this.k = new dksm(this);
        }
        dkqh dkqhVar = this.k;
        if (dkqhVar == null) {
            throw new UnsupportedOperationException(String.format(Locale.US, "Unsupported intent action: %s", action));
        }
        dksm dksmVar = (dksm) dkqhVar;
        rxx rxxVar = dksmVar.a;
        dksmVar.g = rxxVar.getIntent().getIntExtra("widgetType", 0);
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) rxxVar.getIntent().getParcelableExtra("buyflowConfig");
        atzb.t(buyFlowConfig, "BuyFlowConfig is a required nonnull field.");
        dksmVar.h = buyFlowConfig;
        rxxVar.setTheme(true != dkyr.F(rxxVar, dksmVar.h) ? R.style.Theme_Wallet_Bender3_Light_NoActionBar : R.style.Theme_Wallet_Bender3_Dark_NoActionBar);
        rxxVar.getTheme().applyStyle(R.style.Theme_Wallet_Bender3_Common, true);
        String f = eicc.f(rxxVar.getIntent());
        if (!TextUtils.isEmpty(f)) {
            boolean h = eicc.h(rxxVar);
            boolean g = fvyq.g();
            long c2 = fvyq.c();
            int i = R.style.Bender3_Glif_Style;
            if (c2 >= 4 && h) {
                i = R.style.Bender3_Glif_Style_Expressive;
            }
            int[] iArr = {i, eicc.a(rxxVar, f, h, g), eicc.b(rxxVar, h)};
            for (int i2 = 0; i2 < 3; i2++) {
                rxxVar.getTheme().applyStyle(iArr[i2], true);
            }
        }
        egji.a(rxxVar.getApplicationContext());
        super.onCreate(bundle);
        dksm dksmVar2 = (dksm) this.k;
        rxx rxxVar2 = dksmVar2.a;
        dkql.a(rxxVar2);
        if (fvtg.a.lK().e()) {
            iwv.a(rxxVar2.getWindow(), false);
        }
        dksmVar2.f = new dkxw(rxxVar2);
        dkyr.z(dksmVar2.f, true);
        dksmVar2.f.setFitsSystemWindows(true);
        rxxVar2.setContentView(dksmVar2.f);
        int i3 = dlgd.b;
        egag D = egag.D(rxxVar2);
        if (D == null) {
            dlgd dlgdVar = new dlgd();
            egag.c.put(rxxVar2, dlgdVar);
            bp bpVar = new bp(rxxVar2.getSupportFragmentManager());
            bpVar.v(dlgdVar, "ActionExecutorFragment");
            bpVar.a();
        } else if (!dlgd.class.equals(D.getClass())) {
            throw new IllegalStateException("Trying to install multiple distinct subclasses of ActionExecutorFragment!");
        }
        BuyFlowConfig buyFlowConfig2 = dksmVar2.h;
        int i4 = buyFlowConfig2.g;
        dksmVar2.j = i4 != 1 ? i4 != 2 ? 0 : 2 : 1;
        String str = buyFlowConfig2.f;
        egjg.a();
        boolean z = (!fvsj.c() || TextUtils.isEmpty(str) || (byteArrayExtra = rxxVar2.getIntent().getByteArrayExtra("o2ActionToken")) == null || (a = fdmr.a(((dktm) egig.g(byteArrayExtra, (fgtg) dktm.a.iQ(7, null))).b)) == 0 || a != 3) ? false : true;
        dksmVar2.k = z;
        if (z) {
            fxuv fxuvVar = bsxe.a;
            fyea b = fyeb.b(bsxe.a);
            Context applicationContext = rxxVar2.getApplicationContext();
            egdh O = dlgd.O(rxxVar2);
            int i5 = dksmVar2.j;
            Boolean bool = true;
            boolean a2 = eide.a(str);
            if (O.ah == null) {
                bool.getClass();
                O.ah = new egry(applicationContext, str, a2, b);
            }
            if (O.ai == null) {
                O.ai = new egrg(applicationContext, str, a2, b);
            }
            O.aj = O.ah.g() == 3 && (i5 == 2 || i5 == 1);
        }
        dlgd.O(rxxVar2).aq = dksmVar2;
        Intent intent = rxxVar2.getIntent();
        if (dksmVar2.k) {
            egry G = dlgd.O(rxxVar2).G();
            dksv dksvVar = new dksv(rxxVar2, G);
            if (bundle != null) {
                egjg.a();
                if (fvsj.d()) {
                    dksmVar2.u(G, intent, dksvVar);
                } else {
                    dksmVar2.k(intent, bundle, dksvVar, fdcc.SESSION_RESUMPTION_HAVE_SAVED_INSTANCE, false);
                }
            } else if (dksmVar2.j == 0) {
                dksmVar2.m(intent, dksvVar, fdcc.SESSION_RESUMPTION_SESSION_NEW);
            } else {
                int g2 = G.g() - 1;
                if (g2 == 2) {
                    dksmVar2.u(G, intent, dksvVar);
                } else if (g2 != 3) {
                    G.g = G.i.a();
                    G.e(false);
                    G.h = G.j.a();
                    if (dksmVar2.j == 2) {
                        dksmVar2.m(intent, dksvVar, fdcc.SESSION_RESUMPTION_RESTORE_FAIL_CREATE_NEW);
                    } else {
                        dksmVar2.s(intent);
                    }
                } else {
                    Bundle b2 = G.b();
                    if (b2 != null) {
                        Intent intent2 = (Intent) b2.getParcelable("EXTRA_DATA_INTENT");
                        int i6 = b2.getInt("EXTRA_RESULT_CODE");
                        if (intent2 != null && (c = G.c()) != null) {
                            Bundle bundle2 = (Bundle) eidk.a(c, "widgetControllerState");
                            atzb.t(bundle2, "widgetSavedState is a required nonnull field.");
                            WidgetConfig widgetConfig = (WidgetConfig) bundle2.getParcelable("widgetConfig");
                            ekvl.y(widgetConfig);
                            dksmVar2.e = widgetConfig;
                            dksmVar2.n(fdcc.SESSION_RESUMPTION_RESTORE_SUCCESS);
                            rxxVar2.setResult(i6, intent2);
                            rxxVar2.finish();
                        }
                    }
                    dksmVar2.u(G, intent, dksvVar);
                }
            }
        } else if (bundle != null) {
            dksmVar2.k(intent, bundle, null, null, false);
        } else {
            dksmVar2.m(intent, null, null);
        }
        dkqh dkqhVar2 = this.k;
        egjg.a();
        String str2 = true == dksm.v(((dksm) dkqhVar2).b) ? " " : null;
        if (str2 != null) {
            setTitle(str2);
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        dksm dksmVar = (dksm) this.k;
        eghe egheVar = dksmVar.b;
        if (egheVar != null) {
            egheVar.aX();
        }
        dkst dkstVar = dksmVar.c;
        if (dkstVar != null) {
            dkstVar.aX();
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        dksm dksmVar = (dksm) this.k;
        ehxb ehxbVar = dksmVar.l;
        if (ehxbVar == null || !ehxbVar.h()) {
            return;
        }
        ehxb ehxbVar2 = dksmVar.l;
        if (((ehxf) ehxbVar2).d) {
            return;
        }
        ehxbVar2.d(intent);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        dksm dksmVar = (dksm) this.k;
        eghe egheVar = dksmVar.b;
        egheVar.bg(false);
        egheVar.aY();
        dksmVar.c.aY();
        dksmVar.i = false;
        ehxb ehxbVar = dksmVar.l;
        if (ehxbVar != null) {
            ehxbVar.b();
        }
        if (dksmVar.k) {
            dksmVar.r(new Bundle());
        }
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        dkqh dkqhVar = this.k;
        if (i == 700) {
            egdh O = dlgd.O(((dksm) dkqhVar).a);
            int i2 = (strArr.length == 0 && iArr.length == 0) ? 0 : -1;
            egjg.a();
            Intent e = fvqg.c() ? egan.e(egan.c(i2)) : egan.e(0);
            e.putExtra("resultCode", i2);
            if (i2 == -1) {
                e.putExtra("permissionsRequested", strArr);
                e.putExtra("requestedPermissionsGrantResults", iArr);
            }
            O.J(new egan(e));
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onRestart() {
        super.onRestart();
        ((dksm) this.k).b.aZ();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        dksm dksmVar = (dksm) this.k;
        eghe egheVar = dksmVar.b;
        egheVar.bg(true);
        egheVar.ba();
        dksmVar.c.ba();
        dksmVar.i = true;
        ehxb ehxbVar = dksmVar.l;
        if (ehxbVar != null) {
            ehxbVar.e();
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((dksm) this.k).r(bundle);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        ((dksm) this.k).b.bc();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        ((dksm) this.k).b.bd();
    }
}
