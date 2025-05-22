package com.google.android.gms.wallet.ow;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.ocr.RecognitionScreen;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity;
import com.google.android.gms.wallet.addinstrument.AddInstrumentRootChimeraActivity;
import com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity;
import com.google.android.gms.wallet.fixinstrument.FixInstrumentRootChimeraActivity;
import com.google.android.gms.wallet.ib.IbLoadWebPaymentDataChimeraActivity;
import com.google.android.gms.wallet.ib.IbPaymentRequestCompatChimeraActivity;
import com.google.android.gms.wallet.ib.LockScreenForFullWalletChimeraActivity;
import com.google.android.gms.wallet.idcredit.IdCreditChimeraActivity;
import com.google.android.gms.wallet.im.ImRootChimeraActivity;
import com.google.android.gms.wallet.ow.ChooseAccountShimChimeraActivity;
import com.google.android.gms.wallet.paymentmethods.PaymentMethodsChimeraActivity;
import com.google.android.gms.wallet.pm.PmRootChimeraActivity;
import com.google.android.gms.wallet.selector.InitializeGenericSelectorRootChimeraActivity;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.timelineview.TimelineViewChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asvo;
import defpackage.atzb;
import defpackage.aura;
import defpackage.aurd;
import defpackage.aurq;
import defpackage.dkph;
import defpackage.dkqr;
import defpackage.dksf;
import defpackage.dksm;
import defpackage.dkub;
import defpackage.dkuc;
import defpackage.dkud;
import defpackage.dkuf;
import defpackage.dkuh;
import defpackage.dkui;
import defpackage.dkuo;
import defpackage.dkyr;
import defpackage.dlay;
import defpackage.dlbc;
import defpackage.dlbe;
import defpackage.dlbf;
import defpackage.dlbg;
import defpackage.dled;
import defpackage.dlee;
import defpackage.dloy;
import defpackage.dlpa;
import defpackage.dluj;
import defpackage.ehqn;
import defpackage.eicc;
import defpackage.ejwk;
import defpackage.ejwl;
import defpackage.ejyg;
import defpackage.ekro;
import defpackage.ekrp;
import defpackage.ekvl;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.fdcw;
import defpackage.fdii;
import defpackage.fdik;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgrr;
import defpackage.fgsa;
import defpackage.fgsd;
import defpackage.fgtg;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import defpackage.fvtg;
import defpackage.fvul;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.ryt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ChooseAccountShimChimeraActivity extends ryt implements dkqr {
    public static final /* synthetic */ int k = 0;
    private static final Set l = aurq.h("android.intent.action.VIEW", "com.google.android.gms.wallet.onlinewallet.ACTION_GET_MASKED_WALLET", "com.google.android.gms.wallet.onlinewallet.ACTION_LOCK_SCREEN_FOR_FULL_WALLET", "com.google.android.gms.identity.REQUEST_USER_ADDRESS", "com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS", "org.chromium.intent.action.PAY");
    private static final Set m = aurq.j("com.google.android.gms.wallet.ib.ACTION_LOCK_SCREEN_FOR_FULL_WALLET", "com.google.android.gms.wallet.ib.ACTION_COMPAT_LOAD_WEB_PAYMENT_DATA", "com.google.android.gms.wallet.firstparty.ACTION_NOTIFICATION_CLICK");
    public BuyFlowConfig j;
    private dlee n;

    private final void c() {
        boolean equals = getIntent().getData().getHost().equals("payments.google.com");
        String queryParameter = getIntent().getData().getQueryParameter("epfg");
        if (TextUtils.isEmpty(queryParameter)) {
            throw new IllegalArgumentException("Missing encryptedParameter in app link");
        }
        byte[] e = aurd.e(queryParameter);
        dlpa a = BuyFlowConfig.a();
        dloy a2 = ApplicationParameters.a();
        a2.i(3);
        a2.f(equals ? 1 : 0);
        a.b(a2.a);
        a.d(aura.q(this));
        String path = getIntent().getData().getPath();
        if (!TextUtils.equals(path, "/gp/w/verificationhandoff")) {
            throw new IllegalArgumentException("Unsupported path for app link: ".concat(String.valueOf(path)));
        }
        a.e("flow_idv_handoff");
        this.j = a.a();
        dksf.a();
        Account[] c = dksf.c(this);
        if (c == null || c.length <= 0) {
            if (fvtg.f()) {
                k();
                return;
            } else {
                finish();
                return;
            }
        }
        Account account = c[0];
        dloy b = ApplicationParameters.b(this.j.b);
        b.d(account);
        ApplicationParameters applicationParameters = b.a;
        dlpa b2 = BuyFlowConfig.b(this.j);
        b2.b(applicationParameters);
        this.j = b2.a();
        String path2 = getIntent().getData().getPath();
        if (!TextUtils.equals(path2, "/gp/w/verificationhandoff")) {
            throw new IllegalArgumentException("Unsupported path for app link: ".concat(String.valueOf(path2)));
        }
        startActivity(dksm.h(this, 7, e, this.j, SystemClock.elapsedRealtime()));
        finish();
    }

    private final void f(boolean z, final Bundle bundle) {
        this.n = (dlee) new jxw(this).a(dlee.class);
        if (z) {
            ekvl.z(bundle, "launchingIntentExtras must be set if initiateNotificationViewModel is true");
            final dlee dleeVar = this.n;
            final String q = aura.q(this);
            eqgo eqgoVar = dleeVar.b;
            eqgc.t(eqgoVar.submit(new Callable() { // from class: dlec
                /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 309
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dlec.call():java.lang.Object");
                }
            }), new dled(dleeVar), eqgoVar);
        }
        this.n.a.g(this, new jvs() { // from class: dlef
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ChooseAccountShimChimeraActivity chooseAccountShimChimeraActivity = ChooseAccountShimChimeraActivity.this;
                dleb dlebVar = (dleb) obj;
                if (dlebVar == null) {
                    Log.w("ChooseAccountShimChimer", "Failed to load NotificationParams.");
                    chooseAccountShimChimeraActivity.finishAndRemoveTask();
                } else {
                    chooseAccountShimChimeraActivity.j = dlebVar.a;
                    chooseAccountShimChimeraActivity.a(dlebVar.b);
                }
            }
        });
    }

    private final void g() {
        String action = getIntent().getAction();
        if ("com.google.android.gms.identity.REQUEST_USER_ADDRESS".equals(action)) {
            startActivityForResult(InitializeGenericSelectorRootChimeraActivity.Z(this, getIntent(), this.j), 600);
            return;
        }
        if ("com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS".equals(action)) {
            Intent intent = getIntent();
            BuyFlowConfig buyFlowConfig = this.j;
            String str = RootChimeraActivity.a;
            atzb.s(buyFlowConfig);
            atzb.s(buyFlowConfig.b);
            Intent intent2 = new Intent();
            intent2.setClassName(this, "com.google.android.gms.wallet.ow.RootActivity");
            intent2.putExtras(intent.getExtras());
            intent2.putExtra("buyFlowConfig", buyFlowConfig);
            startActivityForResult(intent2, 700);
            return;
        }
        if ("com.google.android.gms.wallet.ACTION_CHECKOUT".equals(action)) {
            n();
            return;
        }
        if ("com.google.android.gms.wallet.ib.ACTION_LOCK_SCREEN_FOR_FULL_WALLET".equals(action)) {
            Intent intent3 = getIntent();
            Parcelable parcelable = this.j;
            int i = LockScreenForFullWalletChimeraActivity.c;
            Intent intent4 = new Intent();
            intent4.setClassName(this, "com.google.android.gms.wallet.ib.LockScreenForFullWalletActivity");
            intent4.putExtras(intent3.getExtras());
            intent4.putExtra("com.google.android.gms.wallet.buyFlowConfig", parcelable);
            startActivityForResult(intent4, 1100);
            return;
        }
        if ("com.google.android.gms.wallet.ib.ACTION_COMPAT_LOAD_WEB_PAYMENT_DATA".equals(action)) {
            Intent intent5 = getIntent();
            Parcelable parcelable2 = this.j;
            int i2 = IbPaymentRequestCompatChimeraActivity.d;
            Intent intent6 = new Intent();
            intent6.setClassName(this, "com.google.android.gms.wallet.ib.IbPaymentRequestCompatActivity");
            intent6.putExtras(intent5.getExtras());
            intent6.putExtra("com.google.android.gms.wallet.buyFlowConfig", parcelable2);
            intent6.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            startActivityForResult(intent6, 1400);
            return;
        }
        if ("org.chromium.intent.action.PAY".equals(action)) {
            Intent intent7 = getIntent();
            Parcelable parcelable3 = this.j;
            int i3 = IbLoadWebPaymentDataChimeraActivity.d;
            Bundle extras = intent7.getExtras();
            Intent intent8 = new Intent();
            intent8.setClassName(this, "com.google.android.gms.wallet.ib.IbLoadWebPaymentDataActivity");
            intent8.putExtra("com.google.android.gms.wallet.buyFlowConfig", parcelable3);
            if (extras != null) {
                intent8.putExtras(extras);
            }
            startActivityForResult(intent8, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            return;
        }
        if ("com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_WIDGET".equals(action)) {
            m();
            return;
        }
        if ("com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT".equals(action)) {
            o();
            return;
        }
        char c = '\b';
        char c2 = 4;
        if ("com.google.android.gms.wallet.firstparty.ACTION_ALERT_ACTION".equals(action)) {
            Intent intent9 = getIntent();
            ejwl ejwlVar = (ejwl) ehqn.c(intent9.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), (fgtg) ejwl.a.iQ(7, null));
            if (!(ejwlVar.c == 4 ? (String) ejwlVar.d : "").isEmpty()) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ejwlVar.c == 4 ? (String) ejwlVar.d : "")));
                setResult(-1);
                finish();
                return;
            }
            int a = ejwk.a(ejwlVar.e);
            if (a == 0 || a == 1) {
                if ((ejwlVar.b & 4) != 0) {
                    fdii fdiiVar = ejwlVar.f;
                    if (fdiiVar == null) {
                        fdiiVar = fdii.a;
                    }
                    startActivityForResult(dkyr.h(fdiiVar, intent9, this, this.j), 2700);
                    return;
                }
                return;
            }
            intent9.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
            int a2 = ejwk.a(ejwlVar.e);
            if (a2 == 0) {
                a2 = 1;
            }
            int i4 = a2 - 1;
            if (i4 == 1) {
                dlbc dlbcVar = new dlbc(intent9);
                if ((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).d() > 0) {
                    dlbcVar.g((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).M());
                } else {
                    if ((ejwlVar.c == 2 ? (fgpr) ejwlVar.d : fgpr.b).d() <= 0) {
                        throw new IllegalArgumentException("BuyFlow Alert Action has no supported uiParameters");
                    }
                    dlbcVar.h((ejwlVar.c == 2 ? (fgpr) ejwlVar.d : fgpr.b).M());
                }
                r(dlbcVar.a());
                n();
                return;
            }
            if (i4 == 4) {
                dlay dlayVar = new dlay(intent9);
                if ((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).d() <= 0) {
                    throw new IllegalArgumentException("AddInstrument Alert Action has no supported uiParameters");
                }
                dlayVar.g((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).M());
                r(dlayVar.a());
                m();
                return;
            }
            if (i4 == 5) {
                dlbe dlbeVar = new dlbe(intent9);
                if ((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).d() > 0) {
                    dlbeVar.g((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).M());
                } else {
                    if ((ejwlVar.c == 2 ? (fgpr) ejwlVar.d : fgpr.b).d() <= 0) {
                        throw new IllegalArgumentException("FixInstrument Alert Action has no supported uiParameters");
                    }
                    dlbeVar.h((ejwlVar.c == 2 ? (fgpr) ejwlVar.d : fgpr.b).M());
                }
                r(dlbeVar.a());
                o();
                return;
            }
            if (i4 == 7) {
                if ((ejwlVar.c == 8 ? (fgpr) ejwlVar.d : fgpr.b).d() == 0) {
                    throw new IllegalArgumentException("InstrumentManager Alert Action has no actionToken");
                }
                ekrp ekrpVar = (ekrp) ehqn.c((ejwlVar.c == 8 ? (fgpr) ejwlVar.d : fgpr.b).M(), (fgtg) ekrp.a.iQ(7, null));
                byte[] M = (ejwlVar.c == 8 ? (fgpr) ejwlVar.d : fgpr.b).M();
                int a3 = ekro.a(ekrpVar.e);
                if (a3 == 0) {
                    a3 = 1;
                }
                r(u(M, a3, intent9));
                int a4 = ekro.a(ekrpVar.e);
                v(a4 != 0 ? a4 : 1);
                return;
            }
            if (i4 != 8) {
                Locale locale = Locale.US;
                int a5 = ejwk.a(ejwlVar.e);
                if (a5 == 0) {
                    a5 = 1;
                }
                throw new IllegalArgumentException(String.format(locale, "Unsupported Alert Action widgetType: %s", Integer.toString(a5 - 1)));
            }
            dlbf dlbfVar = new dlbf(intent9);
            if ((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).d() > 0) {
                dlbfVar.g((ejwlVar.c == 3 ? (fgpr) ejwlVar.d : fgpr.b).M());
            } else {
                if ((ejwlVar.c == 2 ? (fgpr) ejwlVar.d : fgpr.b).d() <= 0) {
                    throw new IllegalArgumentException("IDV Alert Action has no supported uiParameters");
                }
                dlbfVar.h((ejwlVar.c == 2 ? (fgpr) ejwlVar.d : fgpr.b).M());
            }
            r(dlbfVar.a());
            p();
            return;
        }
        if ("com.google.android.gms.wallet.firstparty.ACTION_BOOTSTRAP_WIDGET".equals(action)) {
            a(getIntent());
            return;
        }
        if ("com.google.android.gms.wallet.firstparty.ACTION_ENROLL_INSTRUMENT".equals(action)) {
            Intent intent10 = getIntent();
            Intent a6 = dkuo.a(this, 0, this.j, intent10);
            dkuo.f(a6, intent10.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"));
            startActivityForResult(a6, 1500);
            return;
        }
        if (!"com.google.android.gms.wallet.ACTION_SHIM_CREDIT_CARD_OCR".equals(action)) {
            if (t(action)) {
                setResult(402);
                Log.w("ChooseAccountShimChimer", "Obsolete API called! Returning ERROR_CODE_SERVICE_UNAVAILABLE.");
                finish();
                return;
            } else {
                setResult(402);
                Log.w("ChooseAccountShimChimer", "Unknown API called! Returning ERROR_CODE_SERVICE_UNAVAILABLE.");
                finish();
                return;
            }
        }
        BuyFlowConfig buyFlowConfig2 = this.j;
        Intent intent11 = getIntent();
        fgrc v = dkui.a.v();
        int intExtra = intent11.getIntExtra("com.google.android.gms.ocr.THEME", 0);
        dkub dkubVar = dkub.THEME_UNKNOWN;
        if (intExtra == 0) {
            dkubVar = dkub.THEME_FULL_SCREEN_BRANDED;
        } else if (intExtra == 1) {
            dkubVar = dkub.THEME_DIALOG_BRANDED;
        } else if (intExtra == 2) {
            dkubVar = dkub.THEME_FULL_SCREEN_UNBRANDED;
        } else if (intExtra == 3) {
            dkubVar = dkub.THEME_DIALOG_UNBRANDED;
        } else if (intExtra == 4) {
            dkubVar = dkub.THEME_SUW;
        }
        if (!v.b.L()) {
            v.U();
        }
        dkui dkuiVar = (dkui) v.b;
        dkuiVar.e = dkubVar.g;
        dkuiVar.b |= 1;
        Bundle bundleExtra = intent11.getBundleExtra("com.google.android.gms.ocr.RECOGNITION");
        if (bundleExtra != null) {
            ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("com.google.android.gms.ocr.RECOGNITION_SCREENS");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                fgrc v2 = dkud.a.v();
                int size = parcelableArrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    RecognitionScreen recognitionScreen = (RecognitionScreen) parcelableArrayList.get(i5);
                    fgrc v3 = dkuc.a.v();
                    char c3 = c;
                    String str2 = recognitionScreen.a;
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fgri fgriVar = v3.b;
                    char c4 = c2;
                    dkuc dkucVar = (dkuc) fgriVar;
                    str2.getClass();
                    int i6 = r9;
                    dkucVar.b |= 1;
                    dkucVar.e = str2;
                    String str3 = recognitionScreen.b;
                    if (!fgriVar.L()) {
                        v3.U();
                    }
                    fgri fgriVar2 = v3.b;
                    dkuc dkucVar2 = (dkuc) fgriVar2;
                    str3.getClass();
                    dkucVar2.c = 2;
                    dkucVar2.d = str3;
                    dkuh e = dkuo.e(recognitionScreen.c);
                    if (!fgriVar2.L()) {
                        v3.U();
                    }
                    fgri fgriVar3 = v3.b;
                    dkuc dkucVar3 = (dkuc) fgriVar3;
                    dkucVar3.f = e.f;
                    dkucVar3.b |= 2;
                    String str4 = recognitionScreen.d;
                    if (!fgriVar3.L()) {
                        v3.U();
                    }
                    fgri fgriVar4 = v3.b;
                    dkuc dkucVar4 = (dkuc) fgriVar4;
                    str4.getClass();
                    dkucVar4.b |= 4;
                    dkucVar4.g = str4;
                    String str5 = recognitionScreen.e;
                    if (!fgriVar4.L()) {
                        v3.U();
                    }
                    fgri fgriVar5 = v3.b;
                    dkuc dkucVar5 = (dkuc) fgriVar5;
                    str5.getClass();
                    dkucVar5.b |= 8;
                    dkucVar5.h = str5;
                    boolean z = recognitionScreen.h;
                    if (!fgriVar5.L()) {
                        v3.U();
                    }
                    dkuc dkucVar6 = (dkuc) v3.b;
                    dkucVar6.b |= 64;
                    dkucVar6.k = z;
                    if (!TextUtils.isEmpty(recognitionScreen.f)) {
                        String str6 = recognitionScreen.f;
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        dkuc dkucVar7 = (dkuc) v3.b;
                        str6.getClass();
                        dkucVar7.b |= 16;
                        dkucVar7.i = str6;
                    }
                    if (!TextUtils.isEmpty(recognitionScreen.g)) {
                        String str7 = recognitionScreen.g;
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        dkuc dkucVar8 = (dkuc) v3.b;
                        str7.getClass();
                        dkucVar8.b |= 32;
                        dkucVar8.j = str7;
                    }
                    dkuc dkucVar9 = (dkuc) v3.Q();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    dkud dkudVar = (dkud) v2.b;
                    dkucVar9.getClass();
                    fgsa fgsaVar = dkudVar.b;
                    if (!fgsaVar.c()) {
                        dkudVar.b = fgri.E(fgsaVar);
                    }
                    dkudVar.b.add(dkucVar9);
                    i5++;
                    c = c3;
                    c2 = c4;
                    r9 = i6;
                }
                dkud dkudVar2 = (dkud) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                dkui dkuiVar2 = (dkui) v.b;
                dkudVar2.getClass();
                dkuiVar2.d = dkudVar2;
                dkuiVar2.c = 2;
            }
            int[] intArray = bundleExtra.getIntArray("com.google.android.gms.ocr.RECOGNITION_SCREENTYPES");
            if (intArray != null && (intArray.length) > 0) {
                fgrc v4 = dkuf.b.v();
                for (int i7 : intArray) {
                    dkuh e2 = dkuo.e(i7);
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    dkuf dkufVar = (dkuf) v4.b;
                    e2.getClass();
                    fgrr fgrrVar = dkufVar.c;
                    if (!fgrrVar.c()) {
                        dkufVar.c = fgri.C(fgrrVar);
                    }
                    dkufVar.c.i(e2.f);
                }
                dkuf dkufVar2 = (dkuf) v4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                dkui dkuiVar3 = (dkui) v.b;
                dkufVar2.getClass();
                dkuiVar3.d = dkufVar2;
                dkuiVar3.c = 3;
            }
        }
        byte[] r = ((dkui) v.Q()).r();
        Intent g = dksm.g(this, 10, buyFlowConfig2, 0L);
        g.putExtra("staticWidgetParams", r);
        String f = eicc.f(getIntent());
        if (!TextUtils.isEmpty(f)) {
            eicc.g(g, f);
        }
        r(g);
        startActivityForResult(getIntent(), 2800);
    }

    private final void k() {
        dksf.a();
        startActivityForResult(asvo.b(null, null, new String[]{"com.google"}, false, false, this.j.b.e != 1 ? 0 : 1), 501);
    }

    private final void m() {
        startActivityForResult(AddInstrumentRootChimeraActivity.Z(this, getIntent(), this.j), 1200);
    }

    private final void n() {
        Intent aa = CheckoutChimeraActivity.aa(this, getIntent(), this.j);
        if (fvtg.q()) {
            q(aa);
        } else {
            startActivityForResult(aa, 800);
        }
    }

    private final void o() {
        startActivityForResult(FixInstrumentRootChimeraActivity.Z(this, getIntent(), this.j), 1300);
    }

    private final void p() {
        startActivityForResult(IdCreditChimeraActivity.Z(this, getIntent(), this.j), 1600);
    }

    private final void q(Intent intent) {
        intent.addFlags(33554432);
        startActivity(intent);
        if ((intent.getFlags() & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 65536) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(dkyr.a(this.j), 0);
        }
        finish();
    }

    private final void r(Intent intent) {
        setIntent(intent);
        if (intent.hasExtra("com.google.android.gms.wallet.buyFlowConfig")) {
            this.j = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        }
    }

    private final boolean s() {
        if (!TextUtils.equals(getIntent().getAction(), "android.intent.action.VIEW") || getIntent().getData() == null) {
            return false;
        }
        return TextUtils.equals(getIntent().getData().getHost(), "payments.sandbox.google.com") || TextUtils.equals(getIntent().getData().getHost(), "payments.google.com");
    }

    private static final boolean t(String str) {
        return "com.google.android.gms.wallet.ACTION_REVIEW_PURCHASE_OPTIONS".equals(str) || "com.google.android.gms.wallet.onlinewallet.ACTION_GET_MASKED_WALLET".equals(str) || "com.google.android.gms.wallet.onlinewallet.ACTION_LOCK_SCREEN_FOR_FULL_WALLET".equals(str);
    }

    private static Intent u(byte[] bArr, int i, Intent intent) {
        int i2 = i - 1;
        if (i2 == 1) {
            dlbg dlbgVar = new dlbg(intent);
            dlbgVar.g(bArr);
            return dlbgVar.a();
        }
        if (i2 == 2) {
            dlbg dlbgVar2 = new dlbg("com.google.android.gms.wallet.firstparty.ACTION_UPDATE_INSTRUMENT", intent);
            dlbgVar2.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            return dlbgVar2.a();
        }
        if (i2 != 3) {
            throw new IllegalArgumentException(String.format(Locale.US, "InstrumentManager ActionToken has unsupported flowType: %d", Integer.valueOf(i2)));
        }
        dlbg dlbgVar3 = new dlbg("com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT", intent);
        dlbgVar3.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
        return dlbgVar3.a();
    }

    private final void v(int i) {
        String str;
        int i2 = i - 1;
        if (i2 == 1) {
            str = "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT";
        } else if (i2 == 2) {
            str = "com.google.android.gms.wallet.firstparty.ACTION_UPDATE_INSTRUMENT";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(String.format(Locale.US, "InstrumentManager ActionToken has unsupported flowType: %d", Integer.valueOf(i2)));
            }
            str = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT";
        }
        startActivityForResult(ImRootChimeraActivity.ab(this, getIntent(), this.j, str), 1500);
    }

    public final void a(Intent intent) {
        int length;
        fdcw fdcwVar;
        Intent ab;
        ejyg ejygVar = null;
        switch (intent.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS)) {
            case 1:
                r(new dlay(intent).a());
                m();
                return;
            case 2:
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                if (byteArrayExtra != null && (length = byteArrayExtra.length) > 0) {
                    try {
                        fgri y = fgri.y(fdcw.a, byteArrayExtra, 0, length, fgqp.a());
                        fgri.M(y);
                        fdcwVar = (fdcw) y;
                    } catch (fgsd unused) {
                        fdcwVar = null;
                    }
                    if (fdcwVar != null && fdcwVar.b == 28) {
                        try {
                            fgpr fgprVar = (fgpr) fdcwVar.c;
                            fgqp a = fgqp.a();
                            ejyg ejygVar2 = ejyg.b;
                            fgpx k2 = fgprVar.k();
                            fgri x = ejygVar2.x();
                            try {
                                try {
                                    fgtq b = fgti.a.b(x);
                                    b.l(x, fgpy.p(k2), a);
                                    b.g(x);
                                    try {
                                        k2.z(0);
                                        fgri.M(x);
                                        ejygVar = (ejyg) x;
                                    } catch (fgsd e) {
                                        throw e;
                                    }
                                } catch (IOException e2) {
                                    if (!(e2.getCause() instanceof fgsd)) {
                                        throw new fgsd(e2);
                                    }
                                    throw ((fgsd) e2.getCause());
                                } catch (RuntimeException e3) {
                                    if (!(e3.getCause() instanceof fgsd)) {
                                        throw e3;
                                    }
                                    throw ((fgsd) e3.getCause());
                                }
                            } catch (fgsd e4) {
                                if (!e4.a) {
                                    throw e4;
                                }
                                throw new fgsd(e4);
                            } catch (fguf e5) {
                                throw e5.a();
                            }
                        } catch (fgsd unused2) {
                        }
                        if (ejygVar != null) {
                            ehqn.k(intent, "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", ejygVar);
                        }
                    }
                }
                Intent aa = CheckoutChimeraActivity.aa(this, intent, this.j);
                r(aa);
                if (fvtg.q()) {
                    q(aa);
                    return;
                } else {
                    startActivityForResult(getIntent(), 800);
                    return;
                }
            case 3:
                r(InitializeGenericSelectorRootChimeraActivity.Z(this, intent, this.j));
                startActivityForResult(getIntent(), 1700);
                return;
            case 4:
                Intent Z = OrchestrationDelegatorChimeraActivity.Z(this, intent, this.j);
                Z.setAction("com.google.android.gms.wallet.firstparty.ACTION_EMBEDDED_LANDING_PAGE");
                r(Z);
                startActivityForResult(getIntent(), 1800);
                return;
            case 5:
                r(dkuo.g(this, intent));
                startActivityForResult(getIntent(), 1900);
                return;
            case 6:
                r(FixInstrumentRootChimeraActivity.Z(this, intent, this.j));
                o();
                return;
            case 7:
                r(IdCreditChimeraActivity.Z(this, intent, this.j));
                p();
                return;
            case 8:
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                if (byteArrayExtra2 == null || byteArrayExtra2.length <= 0) {
                    ab = ImRootChimeraActivity.ab(this, intent, this.j, "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT");
                } else {
                    int a2 = ekro.a(((ekrp) ehqn.c(byteArrayExtra2, (fgtg) ekrp.a.iQ(7, null))).e);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    ab = u(byteArrayExtra2, a2, intent);
                }
                r(ab);
                v(2);
                return;
            case 9:
            case 12:
            default:
                Intent h = dluj.h(this, getIntent(), this.j, fdik.a(getIntent().getIntExtra("entryWidgetType", 0)));
                r(h);
                startActivityForResult(h, 2600);
                return;
            case 10:
                r(PaymentMethodsChimeraActivity.Z(this, intent, this.j));
                startActivityForResult(getIntent(), 2100);
                return;
            case 11:
                BuyFlowConfig buyFlowConfig = this.j;
                int i = PmRootChimeraActivity.h;
                Intent intent2 = new Intent();
                intent2.setClassName(this, "com.google.android.gms.wallet.pm.PmRootActivity");
                intent2.putExtras(intent.getExtras());
                intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
                intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_PURCHASE_MANAGER");
                r(intent2);
                startActivityForResult(getIntent(), 2200);
                return;
            case 13:
                r(TimelineViewChimeraActivity.Z(this, intent, this.j));
                if (fvul.c()) {
                    startActivityForResult(getIntent(), 2400);
                    return;
                } else {
                    startActivityForResult(getIntent(), 2600);
                    return;
                }
            case 14:
                r(dkuo.d(this, intent, this.j));
                if (fvul.d()) {
                    startActivityForResult(getIntent(), DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
                    return;
                } else {
                    startActivityForResult(getIntent(), 2600);
                    return;
                }
            case 15:
                r(dkuo.b(this, intent));
                startActivityForResult(getIntent(), 2900);
                return;
            case 16:
                r(dkuo.c(this, intent));
                startActivityForResult(getIntent(), 3000);
                return;
        }
    }

    protected boolean b() {
        return true;
    }

    @Override // defpackage.dkqr
    public final BuyFlowConfig l() {
        return this.j;
    }

    @Override // defpackage.efzb
    public final Account ll() {
        ApplicationParameters applicationParameters;
        BuyFlowConfig buyFlowConfig = this.j;
        if (buyFlowConfig == null || (applicationParameters = buyFlowConfig.b) == null) {
            return null;
        }
        return applicationParameters.b;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 200:
            case 600:
            case 700:
            case 800:
            case 900:
            case ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS /* 1000 */:
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case 1500:
            case 1600:
            case 1700:
            case 1800:
            case 1900:
            case 2000:
            case 2100:
            case 2200:
            case 2300:
            case 2400:
            case DefaultRetryPolicy.DEFAULT_TIMEOUT_MS /* 2500 */:
            case 2600:
            case 2700:
            case 2800:
            case 2900:
            case 3000:
                setResult(i2, intent);
                if (!this.j.d.equals("notification")) {
                    finish();
                    break;
                } else {
                    finishAndRemoveTask();
                    break;
                }
            case 501:
                if (!fvtg.f() || !s()) {
                    if (i2 != -1) {
                        Intent intent2 = new Intent();
                        dkph a = MaskedWallet.a();
                        Intent intent3 = getIntent();
                        MaskedWalletRequest maskedWalletRequest = (MaskedWalletRequest) intent3.getParcelableExtra("com.google.android.gms.wallet.EXTRA_REQUEST");
                        if (maskedWalletRequest != null) {
                            a.b(maskedWalletRequest.a);
                        }
                        String stringExtra = intent3.getStringExtra("com.google.android.gms.wallet.EXTRA_GOOGLE_TRANSACTION_ID");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            a.a(stringExtra);
                        }
                        intent2.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", a.a);
                        setResult(0, intent2);
                        finish();
                        break;
                    }
                } else if (i2 != -1) {
                    finish();
                    break;
                } else {
                    c();
                }
                Account account = new Account(intent.getStringExtra("authAccount"), intent.getStringExtra("accountType"));
                dloy b = ApplicationParameters.b(this.j.b);
                b.a(true);
                b.d(account);
                ApplicationParameters applicationParameters = b.a;
                dlpa b2 = BuyFlowConfig.b(this.j);
                b2.b(applicationParameters);
                this.j = b2.a();
                g();
                break;
            default:
                super.onActivityResult(i, i2, intent);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.ow.ChooseAccountShimChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("buyFlowConfig", this.j);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        if (intent == null || (intent.getFlags() & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 65536) {
            overridePendingTransition(dkyr.a(this.j), 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }
}
