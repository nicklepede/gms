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
import defpackage.arwm;
import defpackage.bp;
import defpackage.bqpn;
import defpackage.diew;
import defpackage.difa;
import defpackage.dihb;
import defpackage.dihi;
import defpackage.dihk;
import defpackage.diic;
import defpackage.diml;
import defpackage.ding;
import defpackage.dius;
import defpackage.ednk;
import defpackage.ednr;
import defpackage.edqg;
import defpackage.edud;
import defpackage.eduy;
import defpackage.edvf;
import defpackage.edwf;
import defpackage.edwh;
import defpackage.eeec;
import defpackage.eeeu;
import defpackage.efjy;
import defpackage.efkc;
import defpackage.efoz;
import defpackage.efqb;
import defpackage.efqh;
import defpackage.eiig;
import defpackage.fann;
import defpackage.fayb;
import defpackage.fbnh;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.feen;
import defpackage.fsuo;
import defpackage.fswp;
import defpackage.fsxm;
import defpackage.ftcw;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvic;
import defpackage.fvid;
import defpackage.ilq;
import defpackage.ivf;
import defpackage.qet;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GenericDelegatorChimeraActivityX extends qet {
    private static final Set j = Collections.singleton("com.google.android.gms.firstparty.ACTION_BENDER3");
    private diew k;

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        diew diewVar = this.k;
        edwf.a();
        Boolean bool = null;
        if (accessibilityEvent.getEventType() == 32 && dihb.v(((dihb) diewVar).b)) {
            bool = Boolean.FALSE;
        }
        return bool != null ? bool.booleanValue() : super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        Intent d;
        ednr ednrVar;
        diew diewVar = this.k;
        if (i == 600) {
            edqg O = dius.O(((dihb) diewVar).a);
            edwf.a();
            Intent e = fsuo.c() ? ednr.e(ednr.c(i2)) : ednr.e(0);
            e.putExtra("resultCode", i2);
            if (intent != null) {
                e.putExtra("resultData", intent);
            }
            O.J(new ednr(e));
            return;
        }
        if (i == 900) {
            dius.O(((dihb) diewVar).a).P(i2, intent);
            return;
        }
        if (i == 1000) {
            edqg O2 = dius.O(((dihb) diewVar).a);
            if (i2 == -1) {
                d = ednr.e(0);
            } else {
                d = ednr.d(intent != null ? eduy.a(intent.getIntExtra("tokenization_result_code", -1)) : 0);
            }
            O2.J(new ednr(d));
            return;
        }
        fbnh fbnhVar = null;
        if (i != 1100) {
            if (i != 800 && i != 801) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            if (fsxm.d() && i2 == 0) {
                if (intent == null) {
                    intent = null;
                } else if (intent.hasExtra("errorCode")) {
                    dius.O(((dihb) diewVar).a).J(ednr.k(intent.getIntExtra("errorCode", 0)));
                    return;
                }
            }
            String dataString = intent != null ? intent.getDataString() : null;
            edqg O3 = dius.O(((dihb) diewVar).a);
            Intent e2 = ednr.e(0);
            e2.putExtra("resultUrl", dataString);
            O3.J(new ednr(e2));
            return;
        }
        edqg O4 = dius.O(((dihb) diewVar).a);
        if (i2 == -1) {
            ednrVar = new ednr(ednr.e(0));
            edwf.a();
            if (intent != null && intent.hasExtra("new_card_info")) {
                CardInfo cardInfo = (CardInfo) ilq.a(intent, "new_card_info", CardInfo.class);
                if (cardInfo != null) {
                    fecj v = fbnh.a.v();
                    fvbo.f(v, "builder");
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    fbnh fbnhVar2 = (fbnh) fecpVar;
                    fbnhVar2.b = 1 | fbnhVar2.b;
                    fbnhVar2.c = cardInfo.E;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    long j2 = cardInfo.B;
                    fbnh fbnhVar3 = (fbnh) v.b;
                    fbnhVar3.b |= 2;
                    fbnhVar3.d = j2;
                    fecp Q = v.Q();
                    fvbo.e(Q, "build(...)");
                    fbnhVar = (fbnh) Q;
                }
                if (fbnhVar != null) {
                    edvf.q(ednrVar.a, "cardInfo", fbnhVar);
                }
            }
        } else {
            ednrVar = new ednr(ednr.d(intent != null ? eduy.a(intent.getIntExtra("tokenization_result_code", -1)) : 0));
        }
        O4.J(ednrVar);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        ((dihb) this.k).b.a();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [enss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [enss, java.lang.Object] */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Bundle c;
        byte[] byteArrayExtra;
        int a;
        String action = getIntent().getAction();
        arwm.t(action, "Intent action must not be null");
        Set set = j;
        set.contains(action);
        if (!set.contains(action)) {
            throw new SecurityException("This action can't be handled through a non exported activity.");
        }
        if (action.hashCode() == 1039885492 && action.equals("com.google.android.gms.firstparty.ACTION_BENDER3")) {
            this.k = new dihb(this);
        }
        diew diewVar = this.k;
        if (diewVar == null) {
            throw new UnsupportedOperationException(String.format(Locale.US, "Unsupported intent action: %s", action));
        }
        dihb dihbVar = (dihb) diewVar;
        qet qetVar = dihbVar.a;
        dihbVar.g = qetVar.getIntent().getIntExtra("widgetType", 0);
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) qetVar.getIntent().getParcelableExtra("buyflowConfig");
        arwm.t(buyFlowConfig, "BuyFlowConfig is a required nonnull field.");
        dihbVar.h = buyFlowConfig;
        qetVar.setTheme(true != ding.F(qetVar, dihbVar.h) ? R.style.Theme_Wallet_Bender3_Light_NoActionBar : R.style.Theme_Wallet_Bender3_Dark_NoActionBar);
        qetVar.getTheme().applyStyle(R.style.Theme_Wallet_Bender3_Common, true);
        String f = efoz.f(qetVar.getIntent());
        if (!TextUtils.isEmpty(f)) {
            boolean h = efoz.h(qetVar);
            boolean g = ftcw.g();
            long c2 = ftcw.c();
            int i = R.style.Bender3_Glif_Style;
            if (c2 >= 4 && h) {
                i = R.style.Bender3_Glif_Style_Expressive;
            }
            int[] iArr = {i, efoz.a(qetVar, f, h, g), efoz.b(qetVar, h)};
            for (int i2 = 0; i2 < 3; i2++) {
                qetVar.getTheme().applyStyle(iArr[i2], true);
            }
        }
        edwh.a(qetVar.getApplicationContext());
        super.onCreate(bundle);
        dihb dihbVar2 = (dihb) this.k;
        qet qetVar2 = dihbVar2.a;
        difa.a(qetVar2);
        if (fsxm.a.a().e()) {
            ivf.a(qetVar2.getWindow(), false);
        }
        dihbVar2.f = new diml(qetVar2);
        ding.z(dihbVar2.f, true);
        dihbVar2.f.setFitsSystemWindows(true);
        qetVar2.setContentView(dihbVar2.f);
        int i3 = dius.b;
        ednk D = ednk.D(qetVar2);
        if (D == null) {
            dius diusVar = new dius();
            ednk.c.put(qetVar2, diusVar);
            bp bpVar = new bp(qetVar2.getSupportFragmentManager());
            bpVar.v(diusVar, "ActionExecutorFragment");
            bpVar.a();
        } else if (!dius.class.equals(D.getClass())) {
            throw new IllegalStateException("Trying to install multiple distinct subclasses of ActionExecutorFragment!");
        }
        BuyFlowConfig buyFlowConfig2 = dihbVar2.h;
        int i4 = buyFlowConfig2.g;
        dihbVar2.j = i4 != 1 ? i4 != 2 ? 0 : 2 : 1;
        String str = buyFlowConfig2.f;
        edwf.a();
        boolean z = (!fswp.c() || TextUtils.isEmpty(str) || (byteArrayExtra = qetVar2.getIntent().getByteArrayExtra("o2ActionToken")) == null || (a = fayb.a(((diic) edvf.g(byteArrayExtra, (feen) diic.a.iB(7, null))).b)) == 0 || a != 3) ? false : true;
        dihbVar2.k = z;
        if (z) {
            fuyx fuyxVar = bqpn.a;
            fvic b = fvid.b(bqpn.a);
            Context applicationContext = qetVar2.getApplicationContext();
            edqg O = dius.O(qetVar2);
            int i5 = dihbVar2.j;
            Boolean bool = true;
            boolean a2 = efqb.a(str);
            if (O.ah == null) {
                bool.getClass();
                O.ah = new eeeu(applicationContext, str, a2, b);
            }
            if (O.ai == null) {
                O.ai = new eeec(applicationContext, str, a2, b);
            }
            O.aj = O.ah.g() == 3 && (i5 == 2 || i5 == 1);
        }
        dius.O(qetVar2).aq = dihbVar2;
        Intent intent = qetVar2.getIntent();
        if (dihbVar2.k) {
            eeeu G = dius.O(qetVar2).G();
            dihk dihkVar = new dihk(qetVar2, G);
            if (bundle != null) {
                edwf.a();
                if (fswp.d()) {
                    dihbVar2.u(G, intent, dihkVar);
                } else {
                    dihbVar2.k(intent, bundle, dihkVar, fann.SESSION_RESUMPTION_HAVE_SAVED_INSTANCE, false);
                }
            } else if (dihbVar2.j == 0) {
                dihbVar2.m(intent, dihkVar, fann.SESSION_RESUMPTION_SESSION_NEW);
            } else {
                int g2 = G.g() - 1;
                if (g2 == 2) {
                    dihbVar2.u(G, intent, dihkVar);
                } else if (g2 != 3) {
                    G.g = G.i.a();
                    G.e(false);
                    G.h = G.j.a();
                    if (dihbVar2.j == 2) {
                        dihbVar2.m(intent, dihkVar, fann.SESSION_RESUMPTION_RESTORE_FAIL_CREATE_NEW);
                    } else {
                        dihbVar2.s(intent);
                    }
                } else {
                    Bundle b2 = G.b();
                    if (b2 != null) {
                        Intent intent2 = (Intent) b2.getParcelable("EXTRA_DATA_INTENT");
                        int i6 = b2.getInt("EXTRA_RESULT_CODE");
                        if (intent2 != null && (c = G.c()) != null) {
                            Bundle bundle2 = (Bundle) efqh.a(c, "widgetControllerState");
                            arwm.t(bundle2, "widgetSavedState is a required nonnull field.");
                            WidgetConfig widgetConfig = (WidgetConfig) bundle2.getParcelable("widgetConfig");
                            eiig.x(widgetConfig);
                            dihbVar2.e = widgetConfig;
                            dihbVar2.n(fann.SESSION_RESUMPTION_RESTORE_SUCCESS);
                            qetVar2.setResult(i6, intent2);
                            qetVar2.finish();
                        }
                    }
                    dihbVar2.u(G, intent, dihkVar);
                }
            }
        } else if (bundle != null) {
            dihbVar2.k(intent, bundle, null, null, false);
        } else {
            dihbVar2.m(intent, null, null);
        }
        diew diewVar2 = this.k;
        edwf.a();
        String str2 = true == dihb.v(((dihb) diewVar2).b) ? " " : null;
        if (str2 != null) {
            setTitle(str2);
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        dihb dihbVar = (dihb) this.k;
        edud edudVar = dihbVar.b;
        if (edudVar != null) {
            edudVar.aX();
        }
        dihi dihiVar = dihbVar.c;
        if (dihiVar != null) {
            dihiVar.aX();
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        dihb dihbVar = (dihb) this.k;
        efjy efjyVar = dihbVar.l;
        if (efjyVar == null || !efjyVar.h()) {
            return;
        }
        efjy efjyVar2 = dihbVar.l;
        if (((efkc) efjyVar2).d) {
            return;
        }
        efjyVar2.d(intent);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        dihb dihbVar = (dihb) this.k;
        edud edudVar = dihbVar.b;
        edudVar.bg(false);
        edudVar.aY();
        dihbVar.c.aY();
        dihbVar.i = false;
        efjy efjyVar = dihbVar.l;
        if (efjyVar != null) {
            efjyVar.b();
        }
        if (dihbVar.k) {
            dihbVar.r(new Bundle());
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        diew diewVar = this.k;
        if (i == 700) {
            edqg O = dius.O(((dihb) diewVar).a);
            int i2 = (strArr.length == 0 && iArr.length == 0) ? 0 : -1;
            edwf.a();
            Intent e = fsuo.c() ? ednr.e(ednr.c(i2)) : ednr.e(0);
            e.putExtra("resultCode", i2);
            if (i2 == -1) {
                e.putExtra("permissionsRequested", strArr);
                e.putExtra("requestedPermissionsGrantResults", iArr);
            }
            O.J(new ednr(e));
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onRestart() {
        super.onRestart();
        ((dihb) this.k).b.aZ();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        dihb dihbVar = (dihb) this.k;
        edud edudVar = dihbVar.b;
        edudVar.bg(true);
        edudVar.ba();
        dihbVar.c.ba();
        dihbVar.i = true;
        efjy efjyVar = dihbVar.l;
        if (efjyVar != null) {
            efjyVar.e();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((dihb) this.k).r(bundle);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        ((dihb) this.k).b.bc();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        ((dihb) this.k).b.bd();
    }
}
