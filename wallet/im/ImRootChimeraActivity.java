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
import defpackage.arwm;
import defpackage.csft;
import defpackage.diez;
import defpackage.difa;
import defpackage.dihb;
import defpackage.dikw;
import defpackage.dimj;
import defpackage.dimk;
import defpackage.ding;
import defpackage.dirm;
import defpackage.disa;
import defpackage.djey;
import defpackage.djfw;
import defpackage.djgp;
import defpackage.djgq;
import defpackage.djgv;
import defpackage.efdi;
import defpackage.efdk;
import defpackage.efoz;
import defpackage.efuz;
import defpackage.efwo;
import defpackage.ehmk;
import defpackage.ehqp;
import defpackage.ehrm;
import defpackage.ehta;
import defpackage.ehtq;
import defpackage.ehwx;
import defpackage.eidz;
import defpackage.eieb;
import defpackage.eiej;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.emen;
import defpackage.feen;
import defpackage.fqor;
import defpackage.fszm;
import defpackage.fszp;
import defpackage.ftax;
import defpackage.ftcb;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ImRootChimeraActivity extends diez {
    protected eiej h;
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
        return buyFlowConfig != null && ding.N(buyFlowConfig.b.f) && fszp.a.a().a();
    }

    private static ehrm ah(eieb eiebVar) {
        int i = eiebVar.c;
        if (i == 2) {
            return (ehrm) eiebVar.d;
        }
        if (((i == 1 ? (ehqp) eiebVar.d : ehqp.a).b & 8) == 0) {
            return null;
        }
        ehrm ehrmVar = (eiebVar.c == 1 ? (ehqp) eiebVar.d : ehqp.a).f;
        return ehrmVar == null ? ehrm.a : ehrmVar;
    }

    private final void ai() {
        dirm ac;
        setContentView(Z());
        ae();
        ad();
        this.n = findViewById(R.id.wallet_root);
        if (this.r) {
            boolean z = this.j;
            int i = dimk.a;
            if (ftcb.a.a().d() && Build.VERSION.SDK_INT > 23) {
                getWindow().setFlags(1024, 1024);
                findViewById(R.id.im_activity_root).getViewTreeObserver().addOnGlobalLayoutListener(new dimj(this, z));
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
        ding.A(this.n);
        if (((dirm) m()) == null) {
            if (!this.r) {
                ac = ac();
            } else if (this.h != null) {
                BuyFlowConfig l = l();
                String str = this.a;
                eiej eiejVar = this.h;
                boolean z2 = this.j;
                LogContext logContext = this.b;
                boolean z3 = this.l;
                boolean z4 = this.m;
                arwm.m(eiejVar != null, "ActionToken must not be null.");
                eidz eidzVar = eiejVar.d;
                if (eidzVar == null) {
                    eidzVar = eidz.a;
                }
                arwm.m((eidzVar.b & 2) != 0, "ActionToken must have a ResponseContext.");
                ac = new disa();
                Bundle bZ = djey.bZ(l, str, logContext);
                efdk.j(bZ, "actionToken", eiejVar);
                bZ.putBoolean("isVisDreDialog", z2);
                bZ.putBoolean("showTitleInHeader", z3);
                bZ.putBoolean("showHeaderSeparator", z4);
                ac.setArguments(bZ);
            } else {
                BuyFlowConfig l2 = l();
                String str2 = this.a;
                byte[] bArr = this.i;
                boolean z5 = this.j;
                LogContext logContext2 = this.b;
                arwm.m(bArr != null, "InstrumentManager parameters must not be null.");
                ac = new disa();
                Bundle bZ2 = djey.bZ(l2, str2, logContext2);
                bZ2.putByteArray("instrumentManagerParams", bArr);
                bZ2.putBoolean("isVisDreDialog", z5);
                ac.setArguments(bZ2);
            }
            B(ac, R.id.instrument_manager_container);
        }
    }

    private final void aj() {
        if (this.h == null) {
            this.h = (eiej) efdk.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", (feen) eiej.a.iB(7, null));
        }
    }

    @Override // defpackage.diez, defpackage.djeb
    public final void K(boolean z) {
        super.K(z);
        if (this.r) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.instrument_manager_toolbar);
            BuyFlowConfig l = l();
            int i = dimk.a;
            if (!z) {
                toolbar.setPadding(getResources().getDimensionPixelSize(R.dimen.wallet_uic_visdre_error_dialog_title_left_padding), 0, getResources().getDimensionPixelSize(R.dimen.wallet_uic_visdre_error_dialog_title_right_padding), 0);
            } else {
                toolbar.setPadding(0, 0, 0, 0);
                dimk.e(toolbar, this, l);
            }
        }
    }

    @Override // defpackage.diez, defpackage.dinh
    public void L(boolean z) {
        if (this.r) {
            View view = this.n;
            int i = true != z ? 0 : 8;
            view.setVisibility(i);
            findViewById(R.id.sticky_button_container).setVisibility(i);
        }
        super.L(z);
    }

    @Override // defpackage.diez
    protected final boolean N() {
        aj();
        eiej eiejVar = this.h;
        return eiejVar != null && eiejVar.f.d() > 0;
    }

    protected int Z() {
        boolean z = this.r;
        return this.j ? true != z ? R.layout.wallet_activity_instrument_manager_dialog : R.layout.wallet_activity_instrument_manager_dialog_visdre : true != z ? R.layout.wallet_activity_instrument_manager : R.layout.wallet_activity_instrument_manager_visdre;
    }

    protected dirm ac() {
        if (this.h == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.i;
            boolean z = this.j;
            boolean z2 = this.k;
            LogContext logContext = this.b;
            arwm.m(bArr != null, "InstrumentManager parameters must not be null.");
            dirm dirmVar = new dirm();
            Bundle bZ = djey.bZ(l, str, logContext);
            bZ.putByteArray("instrumentManagerParams", bArr);
            bZ.putBoolean("isDialog", z);
            bZ.putBoolean("showCancelButton", z2);
            dirmVar.setArguments(bZ);
            return dirmVar;
        }
        BuyFlowConfig l2 = l();
        String str2 = this.a;
        eiej eiejVar = this.h;
        boolean z3 = this.j;
        boolean z4 = this.k;
        LogContext logContext2 = this.b;
        boolean z5 = this.l;
        boolean z6 = this.m;
        arwm.m(eiejVar != null, "ActionToken must not be null.");
        eidz eidzVar = eiejVar.d;
        if (eidzVar == null) {
            eidzVar = eidz.a;
        }
        arwm.m((eidzVar.b & 2) != 0, "ActionToken must have a ResponseContext.");
        dirm dirmVar2 = new dirm();
        Bundle bZ2 = djey.bZ(l2, str2, logContext2);
        efdk.j(bZ2, "actionToken", eiejVar);
        bZ2.putBoolean("isDialog", z3);
        bZ2.putBoolean("showCancelButton", z4);
        bZ2.putBoolean("showTitleInHeader", z5);
        bZ2.putBoolean("showHeaderSeparator", z6);
        dirmVar2.setArguments(bZ2);
        return dirmVar2;
    }

    protected void ad() {
        ((diez) this).d = (ProgressSpinnerView) findViewById(R.id.progress_spinner_container);
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
            this.o = efwo.r(this);
        } else {
            this.o = (TextView) getLayoutInflater().inflate(R.layout.wallet_view_dialog_custom_title, (ViewGroup) null, false);
        }
        kJ().l(this.o);
        kJ().p(16);
        this.o.setText(getTitle());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean af(defpackage.eieb r6) {
        /*
            r5 = this;
            ehrm r6 = ah(r6)
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            int r1 = r6.b
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L27
            ehtq r1 = r6.c
            if (r1 != 0) goto L14
            ehtq r1 = defpackage.ehtq.d
        L14:
            feda r3 = new feda
            fecy r1 = r1.r
            fecz r4 = defpackage.ehtq.a
            r3.<init>(r1, r4)
            ehwx r1 = defpackage.ehwx.UI_LAUNCH_WITH_CAMERA
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
            ehta r6 = r6.h
            if (r6 != 0) goto L34
            ehta r6 = defpackage.ehta.c
        L34:
            feda r3 = new feda
            fecy r6 = r6.k
            fecz r4 = defpackage.ehta.a
            r3.<init>(r6, r4)
            ehwx r6 = defpackage.ehwx.UI_LAUNCH_WITH_CAMERA
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.im.ImRootChimeraActivity.af(eieb):boolean");
    }

    @Override // defpackage.diez, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        super.finish();
        if (Q()) {
            return;
        }
        overridePendingTransition(0, ding.c(l()));
    }

    @Override // defpackage.diez
    protected Intent i() {
        byte[] M = this.h.f.M();
        Intent g = dihb.g(this, 0, l(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
        g.putExtra("o2ActionToken", M);
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.diez, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected void onCreate(Bundle bundle) {
        boolean z;
        WalletCustomTheme walletCustomTheme;
        eiej eiejVar;
        int length;
        if (Q()) {
            q(bundle, true, 2, emen.FLOW_TYPE_INSTRUMENT_MANAGER);
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
            if (fszm.a.a().a()) {
                ding.C(this, l(), ding.f, false);
            } else {
                setTheme(true != ding.F(this, l()) ? R.style.Theme_Wallet_Material_Light_Alert_Dialog_Without_Action_Bar : R.style.Theme_Wallet_Material_Dark_Alert_Dialog_Without_Action_Bar);
            }
            this.q = ag(l());
        } else {
            boolean Q = ding.Q(l());
            this.r = Q;
            if (Q) {
                BuyFlowConfig l = l();
                int i2 = dimk.a;
                if (l != null && (walletCustomTheme = l.b.f) != null && walletCustomTheme.d().getInt("customLayout", 0) == 1) {
                    z = true;
                    this.j = z;
                    ding.C(this, l(), ding.e, true);
                }
            }
            z = false;
            this.j = z;
            ding.C(this, l(), ding.e, true);
        }
        byte[] bArr = new byte[0];
        aj();
        eiej eiejVar2 = this.h;
        if (eiejVar2 != null) {
            eidz eidzVar = eiejVar2.d;
            if (eidzVar == null) {
                eidzVar = eidz.a;
            }
            ehmk ehmkVar = eidzVar.d;
            if (ehmkVar == null) {
                ehmkVar = ehmk.c;
            }
            bArr = ehmkVar.g.M();
        }
        r(bundle, true, 2, emen.FLOW_TYPE_INSTRUMENT_MANAGER, bArr);
        super.onCreate(bundle);
        difa.b(this);
        this.i = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        if (bundle == null && (eiejVar = this.h) != null) {
            eidz eidzVar2 = eiejVar.d;
            if (eidzVar2 == null) {
                eidzVar2 = eidz.a;
            }
            eieb eiebVar = eidzVar2.f;
            if (eiebVar == null) {
                eiebVar = eieb.a;
            }
            if (af(eiebVar)) {
                csft a = dikw.a(this);
                a.c(kW().name);
                String f = efoz.f(getIntent());
                if (f != null) {
                    a.h(4);
                }
                if (ftax.a.a().a()) {
                    ehwx ehwxVar = ehwx.UI_LAUNCH_WITH_CAMERA;
                    eidz eidzVar3 = this.h.d;
                    if (eidzVar3 == null) {
                        eidzVar3 = eidz.a;
                    }
                    eieb eiebVar2 = eidzVar3.f;
                    if (eiebVar2 == null) {
                        eiebVar2 = eieb.a;
                    }
                    int i3 = eitj.d;
                    List list = ejcb.a;
                    ehrm ah = ah(eiebVar2);
                    if (ah != null) {
                        int i4 = ah.b;
                        if ((i4 & 1) != 0) {
                            ehtq ehtqVar = ah.c;
                            if (ehtqVar == null) {
                                ehtqVar = ehtq.d;
                            }
                            list = ehtqVar.u;
                        } else if ((i4 & 32) != 0) {
                            ehta ehtaVar = ah.h;
                            if (ehtaVar == null) {
                                ehtaVar = ehta.c;
                            }
                            list = ehtaVar.r;
                        }
                    }
                    efdi.h(a, ehwxVar, list);
                }
                if (fqor.a.a().g() && !fqor.e()) {
                    BuyFlowConfig l2 = l();
                    a.e(l2.c);
                    a.i(l2.d);
                }
                Intent a2 = a.a();
                this.p = a2;
                if (a2 != null && f != null) {
                    efoz.g(a2, f);
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

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        if (m() != null) {
            ((dirm) m()).X(intent);
        }
    }

    @Override // defpackage.pob, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        TextView textView = this.o;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.diez, defpackage.djew
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
        efuz efuzVar = ((dirm) m()).i;
        if (efuzVar instanceof djgq) {
            v = ((djgq) efuzVar).v();
        } else if (efuzVar instanceof djgv) {
            djgp djgpVar = ((djgv) efuzVar).a;
            if (djgpVar != null && djgpVar.r()) {
                v = djgpVar.c.getText().toString();
            }
            v = null;
        } else {
            if (efuzVar instanceof djfw) {
                efuz efuzVar2 = ((djfw) efuzVar).f;
                if (efuzVar2 instanceof djgq) {
                    v = ((djgq) efuzVar2).v();
                }
            }
            v = null;
        }
        if (v != null) {
            T.putExtra("com.google.android.gms.wallet.cvc", v);
        }
        efuz efuzVar3 = ((dirm) m()).i;
        if (efuzVar3 instanceof djgq) {
            i = ((djgq) efuzVar3).r();
        } else {
            if (efuzVar3 instanceof djfw) {
                efuz efuzVar4 = ((djfw) efuzVar3).f;
                if (efuzVar4 instanceof djgq) {
                    i = ((djgq) efuzVar4).r();
                }
            }
            i = 0;
        }
        if (i != 0) {
            T.putExtra("com.google.android.gms.wallet.cardColor", i);
        }
        String str2 = ((dirm) m()).au;
        if (!TextUtils.isEmpty(str2)) {
            T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SPINNER_CAPTION_TEXT", str2);
        }
        H(-1, T);
    }
}
