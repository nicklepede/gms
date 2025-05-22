package com.google.android.gms.wallet.im;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.atzb;
import defpackage.cuoy;
import defpackage.dkqk;
import defpackage.dkql;
import defpackage.dksm;
import defpackage.dkwh;
import defpackage.dkxu;
import defpackage.dkxv;
import defpackage.dkyr;
import defpackage.dlcx;
import defpackage.dldl;
import defpackage.dlqr;
import defpackage.dlrp;
import defpackage.dlsi;
import defpackage.dlsj;
import defpackage.dlso;
import defpackage.ehql;
import defpackage.ehqn;
import defpackage.eicc;
import defpackage.eiic;
import defpackage.eijr;
import defpackage.ejzq;
import defpackage.ekdv;
import defpackage.ekes;
import defpackage.ekgg;
import defpackage.ekgw;
import defpackage.ekkd;
import defpackage.ekrf;
import defpackage.ekrh;
import defpackage.ekrp;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eosb;
import defpackage.fgtg;
import defpackage.ftio;
import defpackage.fvvd;
import defpackage.fvvg;
import defpackage.fvwo;
import defpackage.fvxv;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ImRootChimeraActivity extends dkqk {
    protected ekrp h;
    protected byte[] i;
    protected boolean j;
    protected boolean k;
    private View n;
    private TextView o;
    private Intent p;
    protected boolean l = true;
    protected boolean m = true;
    private boolean q = false;
    private boolean r = false;

    public static Intent aa(Context context, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.im.ImRootActivity");
        intent2.putExtras(intent.getExtras());
        return intent2;
    }

    public static Intent ab(Context context, Intent intent, BuyFlowConfig buyFlowConfig, String str) {
        Intent aa = aa(context, intent);
        aa.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        aa.setAction(str);
        return aa;
    }

    public static boolean ag(BuyFlowConfig buyFlowConfig) {
        return buyFlowConfig != null && dkyr.N(buyFlowConfig.b.f) && fvvg.a.lK().a();
    }

    private static ekes ah(ekrh ekrhVar) {
        int i = ekrhVar.c;
        if (i == 2) {
            return (ekes) ekrhVar.d;
        }
        if (((i == 1 ? (ekdv) ekrhVar.d : ekdv.a).b & 8) == 0) {
            return null;
        }
        ekes ekesVar = (ekrhVar.c == 1 ? (ekdv) ekrhVar.d : ekdv.a).f;
        return ekesVar == null ? ekes.a : ekesVar;
    }

    private final void ai() {
        dlcx ac;
        setContentView(Z());
        ae();
        ad();
        this.n = findViewById(R.id.wallet_root);
        if (this.r) {
            boolean z = this.j;
            int i = dkxv.a;
            if (fvxv.a.lK().d() && Build.VERSION.SDK_INT > 23) {
                getWindow().setFlags(1024, 1024);
                findViewById(R.id.im_activity_root).getViewTreeObserver().addOnGlobalLayoutListener(new dkxu(this, z));
            }
            if (!this.j) {
                BottomSheetBehavior v = BottomSheetBehavior.v(findViewById(R.id.wallet_root));
                v.H(3);
                v.E(false);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                v.F(displayMetrics.heightPixels);
            }
        }
        dkyr.A(this.n);
        if (((dlcx) m()) == null) {
            if (!this.r) {
                ac = ac();
            } else if (this.h != null) {
                BuyFlowConfig l = l();
                String str = this.a;
                ekrp ekrpVar = this.h;
                boolean z2 = this.j;
                LogContext logContext = this.b;
                boolean z3 = this.l;
                boolean z4 = this.m;
                atzb.m(ekrpVar != null, "ActionToken must not be null.");
                ekrf ekrfVar = ekrpVar.d;
                if (ekrfVar == null) {
                    ekrfVar = ekrf.a;
                }
                atzb.m((ekrfVar.b & 2) != 0, "ActionToken must have a ResponseContext.");
                ac = new dldl();
                Bundle bY = dlqr.bY(l, str, logContext);
                ehqn.j(bY, "actionToken", ekrpVar);
                bY.putBoolean("isVisDreDialog", z2);
                bY.putBoolean("showTitleInHeader", z3);
                bY.putBoolean("showHeaderSeparator", z4);
                ac.setArguments(bY);
            } else {
                BuyFlowConfig l2 = l();
                String str2 = this.a;
                byte[] bArr = this.i;
                boolean z5 = this.j;
                LogContext logContext2 = this.b;
                atzb.m(bArr != null, "InstrumentManager parameters must not be null.");
                ac = new dldl();
                Bundle bY2 = dlqr.bY(l2, str2, logContext2);
                bY2.putByteArray("instrumentManagerParams", bArr);
                bY2.putBoolean("isVisDreDialog", z5);
                ac.setArguments(bY2);
            }
            B(ac, R.id.instrument_manager_container);
        }
    }

    private final void aj() {
        if (this.h == null) {
            this.h = (ekrp) ehqn.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", (fgtg) ekrp.a.iQ(7, null));
        }
    }

    @Override // defpackage.dkqk, defpackage.dlpu
    public final void K(boolean z) {
        super.K(z);
        if (this.r) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.instrument_manager_toolbar);
            BuyFlowConfig l = l();
            int i = dkxv.a;
            if (!z) {
                toolbar.setPadding(getResources().getDimensionPixelSize(R.dimen.wallet_uic_visdre_error_dialog_title_left_padding), 0, getResources().getDimensionPixelSize(R.dimen.wallet_uic_visdre_error_dialog_title_right_padding), 0);
            } else {
                toolbar.setPadding(0, 0, 0, 0);
                dkxv.e(toolbar, this, l);
            }
        }
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public void L(boolean z) {
        if (this.r) {
            View view = this.n;
            int i = true != z ? 0 : 8;
            view.setVisibility(i);
            findViewById(R.id.sticky_button_container).setVisibility(i);
        }
        super.L(z);
    }

    @Override // defpackage.dkqk
    protected final boolean N() {
        aj();
        ekrp ekrpVar = this.h;
        return ekrpVar != null && ekrpVar.f.d() > 0;
    }

    protected int Z() {
        boolean z = this.r;
        return this.j ? true != z ? R.layout.wallet_activity_instrument_manager_dialog : R.layout.wallet_activity_instrument_manager_dialog_visdre : true != z ? R.layout.wallet_activity_instrument_manager : R.layout.wallet_activity_instrument_manager_visdre;
    }

    protected dlcx ac() {
        if (this.h == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.i;
            boolean z = this.j;
            boolean z2 = this.k;
            LogContext logContext = this.b;
            atzb.m(bArr != null, "InstrumentManager parameters must not be null.");
            dlcx dlcxVar = new dlcx();
            Bundle bY = dlqr.bY(l, str, logContext);
            bY.putByteArray("instrumentManagerParams", bArr);
            bY.putBoolean("isDialog", z);
            bY.putBoolean("showCancelButton", z2);
            dlcxVar.setArguments(bY);
            return dlcxVar;
        }
        BuyFlowConfig l2 = l();
        String str2 = this.a;
        ekrp ekrpVar = this.h;
        boolean z3 = this.j;
        boolean z4 = this.k;
        LogContext logContext2 = this.b;
        boolean z5 = this.l;
        boolean z6 = this.m;
        atzb.m(ekrpVar != null, "ActionToken must not be null.");
        ekrf ekrfVar = ekrpVar.d;
        if (ekrfVar == null) {
            ekrfVar = ekrf.a;
        }
        atzb.m((ekrfVar.b & 2) != 0, "ActionToken must have a ResponseContext.");
        dlcx dlcxVar2 = new dlcx();
        Bundle bY2 = dlqr.bY(l2, str2, logContext2);
        ehqn.j(bY2, "actionToken", ekrpVar);
        bY2.putBoolean("isDialog", z3);
        bY2.putBoolean("showCancelButton", z4);
        bY2.putBoolean("showTitleInHeader", z5);
        bY2.putBoolean("showHeaderSeparator", z6);
        dlcxVar2.setArguments(bY2);
        return dlcxVar2;
    }

    protected void ad() {
        ((dkqk) this).d = (ProgressSpinnerView) findViewById(R.id.progress_spinner_container);
    }

    protected void ae() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.instrument_manager_toolbar);
        d(toolbar);
        if (!this.j || this.r) {
            K(true);
            return;
        }
        if (this.q) {
            toolbar.o();
            toolbar.p.a(0, 0);
            this.o = eijr.r(this);
        } else {
            this.o = (TextView) getLayoutInflater().inflate(R.layout.wallet_view_dialog_custom_title, (ViewGroup) null, false);
        }
        kY().l(this.o);
        kY().p(16);
        this.o.setText(getTitle());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean af(defpackage.ekrh r6) {
        /*
            r5 = this;
            ekes r6 = ah(r6)
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            int r1 = r6.b
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L27
            ekgw r1 = r6.c
            if (r1 != 0) goto L14
            ekgw r1 = defpackage.ekgw.d
        L14:
            fgrt r3 = new fgrt
            fgrr r1 = r1.r
            fgrs r4 = defpackage.ekgw.a
            r3.<init>(r1, r4)
            ekkd r1 = defpackage.ekkd.UI_LAUNCH_WITH_CAMERA
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            r1 = r2
            goto L28
        L27:
            r1 = r0
        L28:
            int r3 = r6.b
            r3 = r3 & 32
            if (r3 == 0) goto L47
            ekgg r6 = r6.h
            if (r6 != 0) goto L34
            ekgg r6 = defpackage.ekgg.c
        L34:
            fgrt r3 = new fgrt
            fgrr r6 = r6.k
            fgrs r4 = defpackage.ekgg.a
            r3.<init>(r6, r4)
            ekkd r6 = defpackage.ekkd.UI_LAUNCH_WITH_CAMERA
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L47
            r6 = r2
            goto L48
        L47:
            r6 = r0
        L48:
            if (r1 != 0) goto L4e
            if (r6 == 0) goto L4d
            goto L4e
        L4d:
            return r0
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.im.ImRootChimeraActivity.af(ekrh):boolean");
    }

    @Override // defpackage.dkqk, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        super.finish();
        if (Q()) {
            return;
        }
        overridePendingTransition(0, dkyr.c(l()));
    }

    @Override // defpackage.dkqk
    protected Intent i() {
        byte[] M = this.h.f.M();
        Intent g = dksm.g(this, 0, l(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
        g.putExtra("o2ActionToken", M);
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dkqk, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.im.ImRootChimeraActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected void onCreate(Bundle bundle) {
        boolean z;
        WalletCustomTheme walletCustomTheme;
        ekrp ekrpVar;
        int length;
        if (Q()) {
            q(bundle, true, 2, eosb.FLOW_TYPE_INSTRUMENT_MANAGER);
            super.onCreate(bundle);
            return;
        }
        Intent intent = getIntent();
        int[] intArrayExtra = intent.getIntArrayExtra("com.google.android.gms.themeResIds");
        this.j = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT".equals(intent.getAction());
        this.k = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT".equals(intent.getAction());
        if (intArrayExtra != null && (length = intArrayExtra.length) > 0) {
            setTheme(intArrayExtra[0]);
            for (int i = 1; i < length; i++) {
                getTheme().applyStyle(intArrayExtra[i], true);
            }
        } else if (this.j) {
            if (fvvd.a.lK().a()) {
                dkyr.C(this, l(), dkyr.f, false);
            } else {
                setTheme(true != dkyr.F(this, l()) ? R.style.Theme_Wallet_Material_Light_Alert_Dialog_Without_Action_Bar : R.style.Theme_Wallet_Material_Dark_Alert_Dialog_Without_Action_Bar);
            }
            this.q = ag(l());
        } else {
            boolean Q = dkyr.Q(l());
            this.r = Q;
            if (Q) {
                BuyFlowConfig l = l();
                int i2 = dkxv.a;
                if (l != null && (walletCustomTheme = l.b.f) != null && walletCustomTheme.d().getInt("customLayout", 0) == 1) {
                    z = true;
                    this.j = z;
                    dkyr.C(this, l(), dkyr.e, true);
                }
            }
            z = false;
            this.j = z;
            dkyr.C(this, l(), dkyr.e, true);
        }
        byte[] bArr = new byte[0];
        aj();
        ekrp ekrpVar2 = this.h;
        if (ekrpVar2 != null) {
            ekrf ekrfVar = ekrpVar2.d;
            if (ekrfVar == null) {
                ekrfVar = ekrf.a;
            }
            ejzq ejzqVar = ekrfVar.d;
            if (ejzqVar == null) {
                ejzqVar = ejzq.c;
            }
            bArr = ejzqVar.g.M();
        }
        r(bundle, true, 2, eosb.FLOW_TYPE_INSTRUMENT_MANAGER, bArr);
        super.onCreate(bundle);
        dkql.b(this);
        this.i = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        if (bundle == null && (ekrpVar = this.h) != null) {
            ekrf ekrfVar2 = ekrpVar.d;
            if (ekrfVar2 == null) {
                ekrfVar2 = ekrf.a;
            }
            ekrh ekrhVar = ekrfVar2.f;
            if (ekrhVar == null) {
                ekrhVar = ekrh.a;
            }
            if (af(ekrhVar)) {
                cuoy a = dkwh.a(this);
                a.c(ll().name);
                String f = eicc.f(getIntent());
                if (f != null) {
                    a.h(4);
                }
                if (fvwo.a.lK().a()) {
                    ekkd ekkdVar = ekkd.UI_LAUNCH_WITH_CAMERA;
                    ekrf ekrfVar3 = this.h.d;
                    if (ekrfVar3 == null) {
                        ekrfVar3 = ekrf.a;
                    }
                    ekrh ekrhVar2 = ekrfVar3.f;
                    if (ekrhVar2 == null) {
                        ekrhVar2 = ekrh.a;
                    }
                    int i3 = elgo.d;
                    List list = elpg.a;
                    ekes ah = ah(ekrhVar2);
                    if (ah != null) {
                        int i4 = ah.b;
                        if ((i4 & 1) != 0) {
                            ekgw ekgwVar = ah.c;
                            if (ekgwVar == null) {
                                ekgwVar = ekgw.d;
                            }
                            list = ekgwVar.u;
                        } else if ((i4 & 32) != 0) {
                            ekgg ekggVar = ah.h;
                            if (ekggVar == null) {
                                ekggVar = ekgg.c;
                            }
                            list = ekggVar.r;
                        }
                    }
                    ehql.h(a, ekkdVar, list);
                }
                if (ftio.a.lK().g() && !ftio.e()) {
                    BuyFlowConfig l2 = l();
                    a.e(l2.c);
                    a.i(l2.d);
                }
                Intent a2 = a.a();
                this.p = a2;
                if (a2 != null && f != null) {
                    eicc.g(a2, f);
                }
                Intent intent2 = this.p;
                if (intent2 != null) {
                    startActivityForResult(intent2, 5001);
                    return;
                }
            }
        }
        ai();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        if (m() != null) {
            ((dlcx) m()).X(intent);
        }
    }

    @Override // defpackage.rhf, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        TextView textView = this.o;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final /* bridge */ /* synthetic */ void z(Parcelable parcelable, boolean z) {
        String v;
        int i;
        InstrumentManagerResult instrumentManagerResult = (InstrumentManagerResult) parcelable;
        Intent T = T(z);
        if (instrumentManagerResult != null) {
            String str = instrumentManagerResult.b;
            if (!TextUtils.isEmpty(str)) {
                T.putExtra("com.google.android.gms.wallet.instrumentId", str);
            }
            long j = instrumentManagerResult.c;
            if (j > 0) {
                T.putExtra("com.google.android.gms.wallet.f1InstrumentId", j);
            }
            byte[] bArr = instrumentManagerResult.d;
            if (bArr != null && bArr.length > 0) {
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            }
            byte[] bArr2 = instrumentManagerResult.e;
            if (bArr2 != null && bArr2.length > 0) {
                T.putExtra("com.google.android.gms.wallet.instrumentToken", bArr2);
            }
        }
        eiic eiicVar = ((dlcx) m()).i;
        if (eiicVar instanceof dlsj) {
            v = ((dlsj) eiicVar).v();
        } else if (eiicVar instanceof dlso) {
            dlsi dlsiVar = ((dlso) eiicVar).a;
            if (dlsiVar != null && dlsiVar.r()) {
                v = dlsiVar.c.getText().toString();
            }
            v = null;
        } else {
            if (eiicVar instanceof dlrp) {
                eiic eiicVar2 = ((dlrp) eiicVar).f;
                if (eiicVar2 instanceof dlsj) {
                    v = ((dlsj) eiicVar2).v();
                }
            }
            v = null;
        }
        if (v != null) {
            T.putExtra("com.google.android.gms.wallet.cvc", v);
        }
        eiic eiicVar3 = ((dlcx) m()).i;
        if (eiicVar3 instanceof dlsj) {
            i = ((dlsj) eiicVar3).r();
        } else {
            if (eiicVar3 instanceof dlrp) {
                eiic eiicVar4 = ((dlrp) eiicVar3).f;
                if (eiicVar4 instanceof dlsj) {
                    i = ((dlsj) eiicVar4).r();
                }
            }
            i = 0;
        }
        if (i != 0) {
            T.putExtra("com.google.android.gms.wallet.cardColor", i);
        }
        String str2 = ((dlcx) m()).au;
        if (!TextUtils.isEmpty(str2)) {
            T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SPINNER_CAPTION_TEXT", str2);
        }
        H(-1, T);
    }
}
