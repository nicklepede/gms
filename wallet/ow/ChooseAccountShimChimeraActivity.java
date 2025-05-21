package com.google.android.gms.wallet.ow;

import android.accounts.Account;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
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
import defpackage.arwm;
import defpackage.asng;
import defpackage.asnw;
import defpackage.didw;
import defpackage.difg;
import defpackage.dihb;
import defpackage.diir;
import defpackage.diis;
import defpackage.diit;
import defpackage.diiv;
import defpackage.diix;
import defpackage.diiy;
import defpackage.dije;
import defpackage.ding;
import defpackage.dipn;
import defpackage.dipr;
import defpackage.dipt;
import defpackage.dipu;
import defpackage.dipv;
import defpackage.diss;
import defpackage.dist;
import defpackage.djdf;
import defpackage.djdh;
import defpackage.djiq;
import defpackage.efdk;
import defpackage.efoz;
import defpackage.ehje;
import defpackage.ehjf;
import defpackage.ehla;
import defpackage.eiei;
import defpackage.eiej;
import defpackage.eiig;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.faoh;
import defpackage.fatt;
import defpackage.fatv;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fecy;
import defpackage.fedh;
import defpackage.fedk;
import defpackage.feen;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import defpackage.fsxm;
import defpackage.fsyr;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qfp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChooseAccountShimChimeraActivity extends qfp implements difg {
    public static final /* synthetic */ int k = 0;
    private static final Set l = asnw.h("android.intent.action.VIEW", "com.google.android.gms.wallet.onlinewallet.ACTION_GET_MASKED_WALLET", "com.google.android.gms.wallet.onlinewallet.ACTION_LOCK_SCREEN_FOR_FULL_WALLET", "com.google.android.gms.identity.REQUEST_USER_ADDRESS", "com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS", "org.chromium.intent.action.PAY");
    private static final Set m = asnw.j("com.google.android.gms.wallet.ib.ACTION_LOCK_SCREEN_FOR_FULL_WALLET", "com.google.android.gms.wallet.ib.ACTION_COMPAT_LOAD_WEB_PAYMENT_DATA", "com.google.android.gms.wallet.firstparty.ACTION_NOTIFICATION_CLICK");
    public BuyFlowConfig j;
    private dist n;

    private final void c(boolean z, final Bundle bundle) {
        this.n = (dist) new jrh(this).a(dist.class);
        if (z) {
            eiig.y(bundle, "launchingIntentExtras must be set if initiateNotificationViewModel is true");
            final dist distVar = this.n;
            final String q = asng.q(this);
            ensv ensvVar = distVar.b;
            ensj.t(ensvVar.submit(new Callable() { // from class: disr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Account account;
                    String str;
                    Bundle bundle2 = bundle;
                    String string = bundle2.getString("com.google.android.gms.wallet.accountId");
                    eiig.x(string);
                    digu.a();
                    Application a = dist.this.a();
                    arwm.j();
                    Account[] p = bqna.b(a).p("com.google");
                    int length = p.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            account = null;
                            break;
                        }
                        account = p[i];
                        try {
                            str = account.name;
                            String str2 = uny.a;
                        } catch (IOException | IllegalStateException | unx e) {
                            Log.w("Failed to get accountId", e);
                        }
                        if (string.equals(uoh.e(a, str))) {
                            break;
                        }
                        i++;
                    }
                    String str3 = q;
                    eiig.x(account);
                    djdh a2 = BuyFlowConfig.a();
                    a2.e("notification");
                    a2.d(str3);
                    a2.c(djco.f(str3));
                    djdf a3 = ApplicationParameters.a();
                    a3.d(account);
                    a2.b(a3.a);
                    BuyFlowConfig a4 = a2.a();
                    String string2 = bundle2.getString("com.google.android.gms.wallet.notificationClientPayload", "");
                    int i2 = 1;
                    eiig.b(!TextUtils.isEmpty(string2), "Client payload can not be empty.");
                    int i3 = 7;
                    fapf fapfVar = (fapf) efdk.e(string2, (feen) fapf.a.iB(7, null), 1);
                    eiig.b(fapfVar.b == 1, "client_payload field expected but not found.");
                    fapg fapgVar = fapfVar.b == 1 ? (fapg) fapfVar.c : fapg.a;
                    Intent intent = new Intent();
                    int a5 = fatv.a(fapgVar.c);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int i4 = a5 - 1;
                    if (i4 != 1) {
                        if (i4 == 9) {
                            i2 = 8;
                        } else if (i4 == 16) {
                            i2 = 14;
                        } else if (i4 == 25) {
                            i2 = 2;
                        } else if (i4 != 62) {
                            i2 = 6;
                            if (i4 != 5) {
                                if (i4 != 6) {
                                    if (i4 != 7) {
                                        i2 = 12;
                                        if (i4 != 12) {
                                            i3 = 13;
                                            if (i4 == 13) {
                                                i2 = 11;
                                            } else if (i4 == 18) {
                                                i2 = 4;
                                            } else if (i4 == 19) {
                                                i2 = 5;
                                            } else if (i4 != 22) {
                                                if (i4 != 23) {
                                                    i2 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                                                }
                                            }
                                        } else {
                                            i2 = 10;
                                        }
                                    }
                                    i2 = i3;
                                } else {
                                    i2 = 3;
                                }
                            }
                        } else {
                            i2 = 15;
                        }
                    }
                    intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", i2);
                    intent.putExtra("com.google.android.gms.wallet.requireBender3", fapgVar.e);
                    if ((fapgVar.b & 2) != 0) {
                        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", fapgVar.d.M());
                    }
                    return new disq(a4, intent);
                }
            }), new diss(distVar), ensvVar);
        }
        this.n.a.g(this, new jpd() { // from class: disu
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ChooseAccountShimChimeraActivity chooseAccountShimChimeraActivity = ChooseAccountShimChimeraActivity.this;
                disq disqVar = (disq) obj;
                if (disqVar == null) {
                    Log.w("ChooseAccountShimChimer", "Failed to load NotificationParams.");
                    chooseAccountShimChimeraActivity.finishAndRemoveTask();
                } else {
                    chooseAccountShimChimeraActivity.j = disqVar.a;
                    chooseAccountShimChimeraActivity.a(disqVar.b);
                }
            }
        });
    }

    private final void f() {
        String action = getIntent().getAction();
        if ("com.google.android.gms.identity.REQUEST_USER_ADDRESS".equals(action)) {
            startActivityForResult(InitializeGenericSelectorRootChimeraActivity.Z(this, getIntent(), this.j), 600);
            return;
        }
        if ("com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS".equals(action)) {
            Intent intent = getIntent();
            BuyFlowConfig buyFlowConfig = this.j;
            String str = RootChimeraActivity.a;
            arwm.s(buyFlowConfig);
            arwm.s(buyFlowConfig.b);
            Intent intent2 = new Intent();
            intent2.setClassName(this, "com.google.android.gms.wallet.ow.RootActivity");
            intent2.putExtras(intent.getExtras());
            intent2.putExtra("buyFlowConfig", buyFlowConfig);
            startActivityForResult(intent2, 700);
            return;
        }
        if ("com.google.android.gms.wallet.ACTION_CHECKOUT".equals(action)) {
            k();
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
            g();
            return;
        }
        if ("com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT".equals(action)) {
            m();
            return;
        }
        char c = '\b';
        char c2 = 4;
        if ("com.google.android.gms.wallet.firstparty.ACTION_ALERT_ACTION".equals(action)) {
            Intent intent9 = getIntent();
            ehjf ehjfVar = (ehjf) efdk.c(intent9.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), (feen) ehjf.a.iB(7, null));
            if (!(ehjfVar.c == 4 ? (String) ehjfVar.d : "").isEmpty()) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ehjfVar.c == 4 ? (String) ehjfVar.d : "")));
                setResult(-1);
                finish();
                return;
            }
            int a = ehje.a(ehjfVar.e);
            if (a == 0 || a == 1) {
                if ((ehjfVar.b & 4) != 0) {
                    fatt fattVar = ehjfVar.f;
                    if (fattVar == null) {
                        fattVar = fatt.a;
                    }
                    startActivityForResult(ding.h(fattVar, intent9, this, this.j), 2700);
                    return;
                }
                return;
            }
            intent9.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
            int a2 = ehje.a(ehjfVar.e);
            if (a2 == 0) {
                a2 = 1;
            }
            int i4 = a2 - 1;
            if (i4 == 1) {
                dipr diprVar = new dipr(intent9);
                if ((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).d() > 0) {
                    diprVar.g((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).M());
                } else {
                    if ((ehjfVar.c == 2 ? (feay) ehjfVar.d : feay.b).d() <= 0) {
                        throw new IllegalArgumentException("BuyFlow Alert Action has no supported uiParameters");
                    }
                    diprVar.h((ehjfVar.c == 2 ? (feay) ehjfVar.d : feay.b).M());
                }
                p(diprVar.a());
                k();
                return;
            }
            if (i4 == 4) {
                dipn dipnVar = new dipn(intent9);
                if ((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).d() <= 0) {
                    throw new IllegalArgumentException("AddInstrument Alert Action has no supported uiParameters");
                }
                dipnVar.g((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).M());
                p(dipnVar.a());
                g();
                return;
            }
            if (i4 == 5) {
                dipt diptVar = new dipt(intent9);
                if ((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).d() > 0) {
                    diptVar.g((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).M());
                } else {
                    if ((ehjfVar.c == 2 ? (feay) ehjfVar.d : feay.b).d() <= 0) {
                        throw new IllegalArgumentException("FixInstrument Alert Action has no supported uiParameters");
                    }
                    diptVar.h((ehjfVar.c == 2 ? (feay) ehjfVar.d : feay.b).M());
                }
                p(diptVar.a());
                m();
                return;
            }
            if (i4 == 7) {
                if ((ehjfVar.c == 8 ? (feay) ehjfVar.d : feay.b).d() == 0) {
                    throw new IllegalArgumentException("InstrumentManager Alert Action has no actionToken");
                }
                eiej eiejVar = (eiej) efdk.c((ehjfVar.c == 8 ? (feay) ehjfVar.d : feay.b).M(), (feen) eiej.a.iB(7, null));
                byte[] M = (ehjfVar.c == 8 ? (feay) ehjfVar.d : feay.b).M();
                int a3 = eiei.a(eiejVar.e);
                if (a3 == 0) {
                    a3 = 1;
                }
                p(r(M, a3, intent9));
                int a4 = eiei.a(eiejVar.e);
                s(a4 != 0 ? a4 : 1);
                return;
            }
            if (i4 != 8) {
                Locale locale = Locale.US;
                int a5 = ehje.a(ehjfVar.e);
                if (a5 == 0) {
                    a5 = 1;
                }
                throw new IllegalArgumentException(String.format(locale, "Unsupported Alert Action widgetType: %s", Integer.toString(a5 - 1)));
            }
            dipu dipuVar = new dipu(intent9);
            if ((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).d() > 0) {
                dipuVar.g((ehjfVar.c == 3 ? (feay) ehjfVar.d : feay.b).M());
            } else {
                if ((ehjfVar.c == 2 ? (feay) ehjfVar.d : feay.b).d() <= 0) {
                    throw new IllegalArgumentException("IDV Alert Action has no supported uiParameters");
                }
                dipuVar.h((ehjfVar.c == 2 ? (feay) ehjfVar.d : feay.b).M());
            }
            p(dipuVar.a());
            n();
            return;
        }
        if ("com.google.android.gms.wallet.firstparty.ACTION_BOOTSTRAP_WIDGET".equals(action)) {
            a(getIntent());
            return;
        }
        if ("com.google.android.gms.wallet.firstparty.ACTION_ENROLL_INSTRUMENT".equals(action)) {
            Intent intent10 = getIntent();
            Intent a6 = dije.a(this, 0, this.j, intent10);
            dije.f(a6, intent10.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"));
            startActivityForResult(a6, 1500);
            return;
        }
        if (!"com.google.android.gms.wallet.ACTION_SHIM_CREDIT_CARD_OCR".equals(action)) {
            if (q(action)) {
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
        fecj v = diiy.a.v();
        int intExtra = intent11.getIntExtra("com.google.android.gms.ocr.THEME", 0);
        diir diirVar = diir.THEME_UNKNOWN;
        if (intExtra == 0) {
            diirVar = diir.THEME_FULL_SCREEN_BRANDED;
        } else if (intExtra == 1) {
            diirVar = diir.THEME_DIALOG_BRANDED;
        } else if (intExtra == 2) {
            diirVar = diir.THEME_FULL_SCREEN_UNBRANDED;
        } else if (intExtra == 3) {
            diirVar = diir.THEME_DIALOG_UNBRANDED;
        } else if (intExtra == 4) {
            diirVar = diir.THEME_SUW;
        }
        if (!v.b.L()) {
            v.U();
        }
        diiy diiyVar = (diiy) v.b;
        diiyVar.e = diirVar.g;
        diiyVar.b |= 1;
        Bundle bundleExtra = intent11.getBundleExtra("com.google.android.gms.ocr.RECOGNITION");
        if (bundleExtra != null) {
            ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("com.google.android.gms.ocr.RECOGNITION_SCREENS");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                fecj v2 = diit.a.v();
                int size = parcelableArrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    RecognitionScreen recognitionScreen = (RecognitionScreen) parcelableArrayList.get(i5);
                    fecj v3 = diis.a.v();
                    char c3 = c;
                    String str2 = recognitionScreen.a;
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fecp fecpVar = v3.b;
                    char c4 = c2;
                    diis diisVar = (diis) fecpVar;
                    str2.getClass();
                    int i6 = r9;
                    diisVar.b |= 1;
                    diisVar.e = str2;
                    String str3 = recognitionScreen.b;
                    if (!fecpVar.L()) {
                        v3.U();
                    }
                    fecp fecpVar2 = v3.b;
                    diis diisVar2 = (diis) fecpVar2;
                    str3.getClass();
                    diisVar2.c = 2;
                    diisVar2.d = str3;
                    diix e = dije.e(recognitionScreen.c);
                    if (!fecpVar2.L()) {
                        v3.U();
                    }
                    fecp fecpVar3 = v3.b;
                    diis diisVar3 = (diis) fecpVar3;
                    diisVar3.f = e.f;
                    diisVar3.b |= 2;
                    String str4 = recognitionScreen.d;
                    if (!fecpVar3.L()) {
                        v3.U();
                    }
                    fecp fecpVar4 = v3.b;
                    diis diisVar4 = (diis) fecpVar4;
                    str4.getClass();
                    diisVar4.b |= 4;
                    diisVar4.g = str4;
                    String str5 = recognitionScreen.e;
                    if (!fecpVar4.L()) {
                        v3.U();
                    }
                    fecp fecpVar5 = v3.b;
                    diis diisVar5 = (diis) fecpVar5;
                    str5.getClass();
                    diisVar5.b |= 8;
                    diisVar5.h = str5;
                    boolean z = recognitionScreen.h;
                    if (!fecpVar5.L()) {
                        v3.U();
                    }
                    diis diisVar6 = (diis) v3.b;
                    diisVar6.b |= 64;
                    diisVar6.k = z;
                    if (!TextUtils.isEmpty(recognitionScreen.f)) {
                        String str6 = recognitionScreen.f;
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        diis diisVar7 = (diis) v3.b;
                        str6.getClass();
                        diisVar7.b |= 16;
                        diisVar7.i = str6;
                    }
                    if (!TextUtils.isEmpty(recognitionScreen.g)) {
                        String str7 = recognitionScreen.g;
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        diis diisVar8 = (diis) v3.b;
                        str7.getClass();
                        diisVar8.b |= 32;
                        diisVar8.j = str7;
                    }
                    diis diisVar9 = (diis) v3.Q();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    diit diitVar = (diit) v2.b;
                    diisVar9.getClass();
                    fedh fedhVar = diitVar.b;
                    if (!fedhVar.c()) {
                        diitVar.b = fecp.E(fedhVar);
                    }
                    diitVar.b.add(diisVar9);
                    i5++;
                    c = c3;
                    c2 = c4;
                    r9 = i6;
                }
                diit diitVar2 = (diit) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                diiy diiyVar2 = (diiy) v.b;
                diitVar2.getClass();
                diiyVar2.d = diitVar2;
                diiyVar2.c = 2;
            }
            int[] intArray = bundleExtra.getIntArray("com.google.android.gms.ocr.RECOGNITION_SCREENTYPES");
            if (intArray != null && (intArray.length) > 0) {
                fecj v4 = diiv.b.v();
                for (int i7 : intArray) {
                    diix e2 = dije.e(i7);
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    diiv diivVar = (diiv) v4.b;
                    e2.getClass();
                    fecy fecyVar = diivVar.c;
                    if (!fecyVar.c()) {
                        diivVar.c = fecp.C(fecyVar);
                    }
                    diivVar.c.i(e2.f);
                }
                diiv diivVar2 = (diiv) v4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                diiy diiyVar3 = (diiy) v.b;
                diivVar2.getClass();
                diiyVar3.d = diivVar2;
                diiyVar3.c = 3;
            }
        }
        byte[] r = ((diiy) v.Q()).r();
        Intent g = dihb.g(this, 10, buyFlowConfig2, 0L);
        g.putExtra("staticWidgetParams", r);
        String f = efoz.f(getIntent());
        if (!TextUtils.isEmpty(f)) {
            efoz.g(g, f);
        }
        p(g);
        startActivityForResult(getIntent(), 2800);
    }

    private final void g() {
        startActivityForResult(AddInstrumentRootChimeraActivity.Z(this, getIntent(), this.j), 1200);
    }

    private final void k() {
        Intent aa = CheckoutChimeraActivity.aa(this, getIntent(), this.j);
        if (fsxm.p()) {
            o(aa);
        } else {
            startActivityForResult(aa, 800);
        }
    }

    private final void m() {
        startActivityForResult(FixInstrumentRootChimeraActivity.Z(this, getIntent(), this.j), 1300);
    }

    private final void n() {
        startActivityForResult(IdCreditChimeraActivity.Z(this, getIntent(), this.j), 1600);
    }

    private final void o(Intent intent) {
        intent.addFlags(33554432);
        startActivity(intent);
        if ((intent.getFlags() & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 65536) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(ding.a(this.j), 0);
        }
        finish();
    }

    private final void p(Intent intent) {
        setIntent(intent);
        if (intent.hasExtra("com.google.android.gms.wallet.buyFlowConfig")) {
            this.j = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        }
    }

    private static final boolean q(String str) {
        return "com.google.android.gms.wallet.ACTION_REVIEW_PURCHASE_OPTIONS".equals(str) || "com.google.android.gms.wallet.onlinewallet.ACTION_GET_MASKED_WALLET".equals(str) || "com.google.android.gms.wallet.onlinewallet.ACTION_LOCK_SCREEN_FOR_FULL_WALLET".equals(str);
    }

    private static Intent r(byte[] bArr, int i, Intent intent) {
        int i2 = i - 1;
        if (i2 == 1) {
            dipv dipvVar = new dipv(intent);
            dipvVar.g(bArr);
            return dipvVar.a();
        }
        if (i2 == 2) {
            dipv dipvVar2 = new dipv("com.google.android.gms.wallet.firstparty.ACTION_UPDATE_INSTRUMENT", intent);
            dipvVar2.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            return dipvVar2.a();
        }
        if (i2 != 3) {
            throw new IllegalArgumentException(String.format(Locale.US, "InstrumentManager ActionToken has unsupported flowType: %d", Integer.valueOf(i2)));
        }
        dipv dipvVar3 = new dipv("com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT", intent);
        dipvVar3.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
        return dipvVar3.a();
    }

    private final void s(int i) {
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
        faoh faohVar;
        Intent ab;
        ehla ehlaVar = null;
        switch (intent.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS)) {
            case 1:
                p(new dipn(intent).a());
                g();
                return;
            case 2:
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                if (byteArrayExtra != null && (length = byteArrayExtra.length) > 0) {
                    try {
                        fecp y = fecp.y(faoh.a, byteArrayExtra, 0, length, febw.a());
                        fecp.M(y);
                        faohVar = (faoh) y;
                    } catch (fedk unused) {
                        faohVar = null;
                    }
                    if (faohVar != null && faohVar.b == 28) {
                        try {
                            feay feayVar = (feay) faohVar.c;
                            febw a = febw.a();
                            ehla ehlaVar2 = ehla.b;
                            febe k2 = feayVar.k();
                            fecp x = ehlaVar2.x();
                            try {
                                try {
                                    feex b = feep.a.b(x);
                                    b.l(x, febf.p(k2), a);
                                    b.g(x);
                                    try {
                                        k2.z(0);
                                        fecp.M(x);
                                        ehlaVar = (ehla) x;
                                    } catch (fedk e) {
                                        throw e;
                                    }
                                } catch (fefm e2) {
                                    throw e2.a();
                                } catch (IOException e3) {
                                    if (!(e3.getCause() instanceof fedk)) {
                                        throw new fedk(e3);
                                    }
                                    throw ((fedk) e3.getCause());
                                }
                            } catch (fedk e4) {
                                if (!e4.a) {
                                    throw e4;
                                }
                                throw new fedk(e4);
                            } catch (RuntimeException e5) {
                                if (!(e5.getCause() instanceof fedk)) {
                                    throw e5;
                                }
                                throw ((fedk) e5.getCause());
                            }
                        } catch (fedk unused2) {
                        }
                        if (ehlaVar != null) {
                            efdk.k(intent, "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", ehlaVar);
                        }
                    }
                }
                Intent aa = CheckoutChimeraActivity.aa(this, intent, this.j);
                p(aa);
                if (fsxm.p()) {
                    o(aa);
                    return;
                } else {
                    startActivityForResult(getIntent(), 800);
                    return;
                }
            case 3:
                p(InitializeGenericSelectorRootChimeraActivity.Z(this, intent, this.j));
                startActivityForResult(getIntent(), 1700);
                return;
            case 4:
                Intent Z = OrchestrationDelegatorChimeraActivity.Z(this, intent, this.j);
                Z.setAction("com.google.android.gms.wallet.firstparty.ACTION_EMBEDDED_LANDING_PAGE");
                p(Z);
                startActivityForResult(getIntent(), 1800);
                return;
            case 5:
                p(dije.g(this, intent));
                startActivityForResult(getIntent(), 1900);
                return;
            case 6:
                p(FixInstrumentRootChimeraActivity.Z(this, intent, this.j));
                m();
                return;
            case 7:
                p(IdCreditChimeraActivity.Z(this, intent, this.j));
                n();
                return;
            case 8:
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                if (byteArrayExtra2 == null || byteArrayExtra2.length <= 0) {
                    ab = ImRootChimeraActivity.ab(this, intent, this.j, "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT");
                } else {
                    int a2 = eiei.a(((eiej) efdk.c(byteArrayExtra2, (feen) eiej.a.iB(7, null))).e);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    ab = r(byteArrayExtra2, a2, intent);
                }
                p(ab);
                s(2);
                return;
            case 9:
            case 12:
            default:
                Intent h = djiq.h(this, getIntent(), this.j, fatv.a(getIntent().getIntExtra("entryWidgetType", 0)));
                p(h);
                startActivityForResult(h, 2600);
                return;
            case 10:
                p(PaymentMethodsChimeraActivity.Z(this, intent, this.j));
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
                p(intent2);
                startActivityForResult(getIntent(), 2200);
                return;
            case 13:
                p(TimelineViewChimeraActivity.Z(this, intent, this.j));
                if (fsyr.c()) {
                    startActivityForResult(getIntent(), 2400);
                    return;
                } else {
                    startActivityForResult(getIntent(), 2600);
                    return;
                }
            case 14:
                p(dije.d(this, intent, this.j));
                if (fsyr.d()) {
                    startActivityForResult(getIntent(), DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
                    return;
                } else {
                    startActivityForResult(getIntent(), 2600);
                    return;
                }
            case 15:
                p(dije.b(this, intent));
                startActivityForResult(getIntent(), 2900);
                return;
            case 16:
                p(dije.c(this, intent));
                startActivityForResult(getIntent(), 3000);
                return;
        }
    }

    protected boolean b() {
        return true;
    }

    @Override // defpackage.edmf
    public final Account kW() {
        ApplicationParameters applicationParameters;
        BuyFlowConfig buyFlowConfig = this.j;
        if (buyFlowConfig == null || (applicationParameters = buyFlowConfig.b) == null) {
            return null;
        }
        return applicationParameters.b;
    }

    @Override // defpackage.difg
    public final BuyFlowConfig l() {
        return this.j;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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
                if (i2 == -1) {
                    Account account = new Account(intent.getStringExtra("authAccount"), intent.getStringExtra("accountType"));
                    djdf b = ApplicationParameters.b(this.j.b);
                    b.a(true);
                    b.d(account);
                    ApplicationParameters applicationParameters = b.a;
                    djdh b2 = BuyFlowConfig.b(this.j);
                    b2.b(applicationParameters);
                    this.j = b2.a();
                    f();
                    break;
                } else {
                    Intent intent2 = new Intent();
                    didw a = MaskedWallet.a();
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
            default:
                super.onActivityResult(i, i2, intent);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x026f  */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.ow.ChooseAccountShimChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("buyFlowConfig", this.j);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        if (intent == null || (intent.getFlags() & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 65536) {
            overridePendingTransition(ding.a(this.j), 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }
}
