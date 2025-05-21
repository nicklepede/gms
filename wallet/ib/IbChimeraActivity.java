package com.google.android.gms.wallet.ib;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.chimera.Fragment;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.analytics.events.LoadPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.LoadWebPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationClosedEvent;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletReceivedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwAccountChangedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwUnsuccessfulEvent;
import com.google.android.gms.wallet.analytics.events.SimpleAnalyticsEvent;
import com.google.android.gms.wallet.buyflow.BuyFlowResult;
import com.google.android.gms.wallet.common.ui.PopoverView;
import com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation;
import com.google.android.gms.wallet.intentoperation.ib.PrefetchFullWalletIntentOperation;
import com.google.android.gms.wallet.intentoperation.ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.service.ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arfc;
import defpackage.arwm;
import defpackage.asqx;
import defpackage.didm;
import defpackage.didw;
import defpackage.diez;
import defpackage.dijf;
import defpackage.dijq;
import defpackage.dikj;
import defpackage.dikz;
import defpackage.dils;
import defpackage.dimd;
import defpackage.dimf;
import defpackage.dimg;
import defpackage.ding;
import defpackage.dioc;
import defpackage.diqx;
import defpackage.ditw;
import defpackage.diud;
import defpackage.diuu;
import defpackage.divi;
import defpackage.dixi;
import defpackage.diyf;
import defpackage.djdf;
import defpackage.djdh;
import defpackage.djdj;
import defpackage.djdo;
import defpackage.djdr;
import defpackage.djds;
import defpackage.djdu;
import defpackage.djfd;
import defpackage.ednp;
import defpackage.edoa;
import defpackage.edos;
import defpackage.edup;
import defpackage.eduq;
import defpackage.efat;
import defpackage.efdk;
import defpackage.efph;
import defpackage.ehle;
import defpackage.ehlf;
import defpackage.ehlq;
import defpackage.emdu;
import defpackage.emeb;
import defpackage.emec;
import defpackage.emee;
import defpackage.emef;
import defpackage.emen;
import defpackage.fanr;
import defpackage.fans;
import defpackage.fanu;
import defpackage.fanv;
import defpackage.fapk;
import defpackage.farm;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.feen;
import defpackage.fszj;
import defpackage.ftan;
import defpackage.ftaq;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IbChimeraActivity extends diez implements dimd, dils {
    private static final String z = dimg.b("ibActivity");
    private dimg A;
    public BuyFlowConfig h;
    public IbBuyFlowInput i;
    WidgetConfig j;
    public IbMerchantParameters k;
    Bundle m;
    public ProcessBuyFlowResultResponse n;
    String o;
    boolean p;
    boolean q;
    int r;
    public djdu s;
    public long t;
    PopoverView v;
    public edoa w;
    public dijq x;
    diud l = new diqx(this);
    boolean u = false;
    int y = 1;

    public static Intent Z(BuyFlowConfig buyFlowConfig, byte[] bArr, byte[] bArr2, IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, String str) {
        arwm.t(buyFlowConfig, "buyFlowConfig is required");
        arwm.t(ibBuyFlowInput, "buyFlowInput is required");
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        if (bArr != null && bArr.length > 0) {
            bundle.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
        }
        bundle.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN", bArr2);
        bundle.putParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS", aa(ibBuyFlowInput, ibMerchantParameters, str, null));
        Intent intent = new Intent("com.google.android.gms.wallet.ib.INSTANT_BUY");
        intent.setClassName(arfc.a(), "com.google.android.gms.wallet.ib.IbActivity");
        if (ftan.a.a().a()) {
            intent.putExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras", diyf.c(bundle));
        } else {
            intent.putExtras(bundle);
        }
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        intent.setPackage("com.google.android.gms");
        return intent;
    }

    private final void aA(int i, int i2, int i3, int i4) {
        IbChimeraActivity ibChimeraActivity;
        int i5;
        BuyFlowConfig buyFlowConfig;
        String str;
        int i6;
        int i7;
        if (i3 != 0) {
            BuyFlowConfig buyFlowConfig2 = this.h;
            String m = this.i.m();
            int N = this.i.N() - 1;
            int i8 = 3;
            if (N != 1) {
                if (N == 3) {
                    ibChimeraActivity = this;
                    i5 = i2;
                    i7 = i3;
                    buyFlowConfig = buyFlowConfig2;
                    str = m;
                    i6 = 4;
                } else if (N == 4) {
                    ibChimeraActivity = this;
                    i5 = i2;
                    i7 = i3;
                    buyFlowConfig = buyFlowConfig2;
                    str = m;
                    i6 = 5;
                } else if (N == 5) {
                    ibChimeraActivity = this;
                    i5 = i2;
                    i7 = i3;
                    buyFlowConfig = buyFlowConfig2;
                    str = m;
                    i6 = 6;
                } else if (N != 6) {
                    ibChimeraActivity = this;
                    i5 = i2;
                    i7 = i3;
                    buyFlowConfig = buyFlowConfig2;
                    str = m;
                    i6 = 1;
                } else {
                    i8 = 7;
                }
                ReportErrorChimeraIntentOperation.a(buyFlowConfig, str, i6, i5, i7, ibChimeraActivity);
            }
            ibChimeraActivity = this;
            i5 = i2;
            buyFlowConfig = buyFlowConfig2;
            str = m;
            i6 = i8;
            i7 = i3;
            ReportErrorChimeraIntentOperation.a(buyFlowConfig, str, i6, i5, i7, ibChimeraActivity);
        }
        efat.r(this.b, dikz.a(i), i2);
        AnalyticsIntentOperation.b(this, new OrchestrationClosedEvent(i, i2, i4, kW().name, this.a));
        int N2 = this.i.N() - 1;
        if (N2 == 4) {
            String str2 = this.h.b.b.name;
            BuyFlowConfig buyFlowConfig3 = this.h;
            int i9 = this.y;
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            OwFullWalletRequestedEvent.b(this, buyFlowConfig3, i, i2, i3, 0, 0L, i10, str2, this.i.m());
            return;
        }
        if (N2 != 5) {
            if (N2 != 6) {
                if (i4 == 2) {
                    int i11 = this.y;
                    int i12 = i11 - 1;
                    if (i11 == 0) {
                        throw null;
                    }
                    OwMaskedWalletReceivedEvent.b(this, i12, this.i.m(), this.o, -1);
                    return;
                }
                int i13 = this.y;
                int i14 = i13 - 1;
                if (i13 == 0) {
                    throw null;
                }
                OwMwUnsuccessfulEvent.b(this, i2, i, i3, i14, this.o, this.i.m());
                return;
            }
            int i15 = i - 1;
            BuyFlowConfig buyFlowConfig4 = this.h;
            fecj v = emeb.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            emeb emebVar = (emeb) fecpVar;
            emebVar.c = i15;
            emebVar.b |= 1;
            if (!fecpVar.L()) {
                v.U();
            }
            fecp fecpVar2 = v.b;
            emeb emebVar2 = (emeb) fecpVar2;
            emebVar2.b = 2 | emebVar2.b;
            emebVar2.d = i2;
            if (!fecpVar2.L()) {
                v.U();
            }
            emeb emebVar3 = (emeb) v.b;
            emebVar3.b |= 4;
            emebVar3.e = i3;
            if (this.i.m() != null) {
                String m2 = this.i.m();
                if (!v.b.L()) {
                    v.U();
                }
                emeb emebVar4 = (emeb) v.b;
                m2.getClass();
                emebVar4.b |= 8;
                emebVar4.f = m2;
            }
            fapk v2 = dixi.v(this.i);
            if (!v.b.L()) {
                v.U();
            }
            emeb emebVar5 = (emeb) v.b;
            v2.getClass();
            emebVar5.g = v2;
            emebVar5.b |= 16;
            LoadPaymentDataCallEvent.b(this, buyFlowConfig4, (emeb) v.Q(), this.k.d);
            return;
        }
        int i16 = i - 1;
        BuyFlowConfig buyFlowConfig5 = this.h;
        fecj v3 = emec.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar3 = v3.b;
        emec emecVar = (emec) fecpVar3;
        emecVar.c = i16;
        emecVar.b |= 1;
        if (!fecpVar3.L()) {
            v3.U();
        }
        fecp fecpVar4 = v3.b;
        emec emecVar2 = (emec) fecpVar4;
        emecVar2.b = 2 | emecVar2.b;
        emecVar2.d = i2;
        if (!fecpVar4.L()) {
            v3.U();
        }
        emec emecVar3 = (emec) v3.b;
        emecVar3.b |= 4;
        emecVar3.e = i3;
        if (this.i.m() != null) {
            String m3 = this.i.m();
            if (!v3.b.L()) {
                v3.U();
            }
            emec emecVar4 = (emec) v3.b;
            m3.getClass();
            emecVar4.b |= 8;
            emecVar4.f = m3;
        }
        int i17 = this.y;
        if (!v3.b.L()) {
            v3.U();
        }
        emec emecVar5 = (emec) v3.b;
        int i18 = i17 - 1;
        if (i17 == 0) {
            throw null;
        }
        emecVar5.g = i18;
        emecVar5.b |= 16;
        fapk w = dixi.w(((farm) this.i.e.b).e);
        if (w != null) {
            if (!v3.b.L()) {
                v3.U();
            }
            emec emecVar6 = (emec) v3.b;
            emecVar6.i = w;
            emecVar6.b |= 64;
        }
        String a = dioc.a(this.i.n());
        if (!v3.b.L()) {
            v3.U();
        }
        emec emecVar7 = (emec) v3.b;
        emecVar7.b |= 32;
        emecVar7.h = a;
        LoadWebPaymentDataCallEvent.b(this, buyFlowConfig5, (emec) v3.Q(), this.h.b.b.name, this.k.d);
    }

    private final void aB(int i) {
        this.u = true;
        if (i == 7) {
            ao(7);
            return;
        }
        if (m() == null || !((dijq) m()).ax()) {
            if (i == 9) {
                aq(8, 1061);
                return;
            } else {
                aC(i);
                return;
            }
        }
        byte[] az = ((dijq) m()).az();
        if (az.length == 0) {
            ao(8);
        } else {
            aw((ehlf) efdk.c(az, (feen) ehlf.a.iB(7, null)));
        }
    }

    private final void aC(int i) {
        aA(4, -1, 0, i);
        setResult(0);
        finish();
    }

    private final void aD(WalletExitResult walletExitResult, int i) {
        ax(walletExitResult.e, i - 1);
    }

    public static Bundle aa(IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, String str, emdu emduVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory", ibBuyFlowInput);
        bundle.putParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters", ibMerchantParameters);
        bundle.putString("apiCallAnalyticsSessionId", str);
        if (ftaq.i() && emduVar != null) {
            bundle.putByteArray("com.google.android.gms.wallet.ib.IbActivity.loggingInfo", emduVar.r());
        }
        return bundle;
    }

    public static ehlq ak(BuyFlowResult buyFlowResult) {
        ehlq ehlqVar = ehlq.a;
        byte[] bArr = buyFlowResult.d;
        return bArr != null ? (ehlq) efdk.c(bArr, (feen) ehlq.a.iB(7, null)) : ehlqVar;
    }

    private final void ar(WalletExitResult walletExitResult) {
        this.v.d(walletExitResult);
    }

    private final void as() {
        ab().b.d(this.l, this.r);
        this.r = -1;
    }

    private final void at() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    private final void au() {
        if (this.p) {
            return;
        }
        this.p = true;
        dimf a = dimf.a(kW(), djdj.e(this.h.b));
        a.d(this);
        getSupportFragmentManager().beginTransaction().add(a, "RetrieveAuthTokensFragment").commit();
    }

    private final void av(WalletExitResult walletExitResult) {
        aD(walletExitResult, 1);
    }

    private final void aw(ehlf ehlfVar) {
        if (!asqx.d(ehlfVar.d)) {
            dixi.M(this.i.l(), ehlfVar.d);
        }
        int a = ehle.a(ehlfVar.b);
        if (a == 0) {
            a = 1;
        }
        ExecutorService executorService = dixi.a;
        ax(dixi.ad(a), ehlfVar.c);
    }

    private final void ax(int i, int i2) {
        aA(5, i, i2, 9);
        Intent intent = new Intent();
        int N = this.i.N() - 1;
        if (N == 1 || N == 3) {
            didw a = MaskedWallet.a();
            a.a(this.i.m());
            a.b(this.k.b);
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", a.a);
        } else if (N == 4) {
            didm a2 = FullWallet.a();
            a2.a(this.i.m());
            a2.b(this.k.b);
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", a2.a);
        }
        dikj.b(this.h, intent, i);
        setResult(1, intent);
        finish();
    }

    private final void ay() {
        if (this.r == -1) {
            this.r = ab().b.a(this.l);
        }
    }

    private final void az() {
        if (ab() == null) {
            this.A = dimg.a(8, this.h, kW());
            getSupportFragmentManager().beginTransaction().add(this.A, z).commit();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    @Override // defpackage.diez
    public final void A(WalletExitResult walletExitResult) {
        if (this.q) {
            ar(walletExitResult);
        } else {
            super.A(walletExitResult);
        }
    }

    @Override // defpackage.diez, defpackage.djew
    public final void X(int i) {
        this.v.p(i);
    }

    final dimg ab() {
        if (this.A == null) {
            this.A = (dimg) getSupportFragmentManager().findFragmentByTag(z);
        }
        return this.A;
    }

    @Override // defpackage.dimd
    public final void ac() {
        aq(409, 1038);
    }

    @Override // defpackage.dimd
    public final void ad(int i) {
        aq(409, 1039);
    }

    @Override // defpackage.dimd
    public final void ae() {
        at();
    }

    @Override // defpackage.dils
    public final void af(WalletExitResult walletExitResult) {
        this.u = true;
        if (walletExitResult.c() == 7) {
            av(walletExitResult);
            return;
        }
        if (m() != null && ((dijq) m()).ax()) {
            byte[] az = ((dijq) m()).az();
            if (az.length == 0) {
                av(walletExitResult);
                return;
            } else {
                aw((ehlf) efdk.c(az, (feen) ehlf.a.iB(7, null)));
                return;
            }
        }
        if (walletExitResult.c() == 9) {
            aD(walletExitResult, 1061);
            return;
        }
        aA(4, -1, 0, walletExitResult.c());
        setResult(0);
        finish();
    }

    @Override // defpackage.dils
    public final void ah() {
        if (m() != null) {
            ((dijq) m()).al();
        }
    }

    @Override // defpackage.dils
    public final void ai() {
        djfd b = WalletExitResult.b();
        b.c(0);
        b.d(401);
        b.b(3);
        A(b.a);
    }

    public final WidgetConfig aj() {
        if (this.j == null) {
            this.j = dijf.a(this.h, getApplicationContext(), 2, null, Long.valueOf(UUID.randomUUID().getLeastSignificantBits()));
        }
        return this.j;
    }

    @Override // defpackage.dils
    public final void al(int i) {
        aB(i);
    }

    public final void am(emef emefVar) {
        Context applicationContext = getApplicationContext();
        BuyFlowConfig buyFlowConfig = this.h;
        SimpleAnalyticsEvent.b(applicationContext, buyFlowConfig, emefVar, buyFlowConfig.b.b);
    }

    public final void an(fanv fanvVar) {
        try {
            fecj v = djdo.a.v();
            djdr djdrVar = djdr.CALLBACK_TYPE_PAYMENT_DATA_CHANGE;
            if (!v.b.L()) {
                v.U();
            }
            ((djdo) v.b).b = djdrVar.a();
            ExecutorService executorService = dixi.a;
            JSONObject jSONObject = new JSONObject();
            for (fans fansVar : fanvVar.c) {
                JSONObject jSONObject2 = new JSONObject(fansVar.d);
                int a = fanr.a(fansVar.c);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 1) {
                    jSONObject.put("shippingAddress", jSONObject2);
                } else if (i == 2) {
                    jSONObject.put("shippingOptionData", jSONObject2);
                } else if (i == 3) {
                    jSONObject.put("paymentMethodData", jSONObject2);
                }
            }
            fanu b = fanu.b(fanvVar.d);
            if (b == null) {
                b = fanu.UNKNOWN_CALLBACK_TRIGGER;
            }
            jSONObject.put("callbackTrigger", b.name());
            fecj v2 = djds.a.v();
            String jSONObject3 = jSONObject.toString();
            if (!v2.b.L()) {
                v2.U();
            }
            djds djdsVar = (djds) v2.b;
            jSONObject3.getClass();
            djdsVar.b = jSONObject3;
            Bundle bundle = this.i.a;
            if (bundle != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                feay w = feay.w(marshall);
                if (!v2.b.L()) {
                    v2.U();
                }
                ((djds) v2.b).c = w;
            }
            feay ng = ((djds) v2.Q()).ng();
            if (!v.b.L()) {
                v.U();
            }
            ((djdo) v.b).c = ng;
            this.t = SystemClock.elapsedRealtime();
            this.w.b(edos.a((djdo) v.Q(), this.h.c, aj()));
        } catch (JSONException e) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "Callback failed while creating JSONObject for IntermediatePaymentData object for callback request: %s", e.getMessage()));
        }
    }

    public final void ao(int i) {
        aq(i, 1);
    }

    public final void ap() {
        Intent intent;
        MaskedWallet maskedWallet;
        ProcessBuyFlowResultResponse processBuyFlowResultResponse = this.n;
        if (processBuyFlowResultResponse.b == 1) {
            int a = dikj.a(this.h, processBuyFlowResultResponse.c);
            int i = this.n.e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            aA(5, a, i2, 9);
        } else {
            aA(2, -1, 0, 2);
        }
        ProcessBuyFlowResultResponse processBuyFlowResultResponse2 = this.n;
        if (processBuyFlowResultResponse2.b == -1 && (intent = processBuyFlowResultResponse2.c) != null && (maskedWallet = (MaskedWallet) intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET")) != null) {
            startService(PrefetchFullWalletIntentOperation.a(this, this.h, maskedWallet.a, maskedWallet.b));
        }
        ProcessBuyFlowResultResponse processBuyFlowResultResponse3 = this.n;
        setResult(processBuyFlowResultResponse3.b, processBuyFlowResultResponse3.c);
        finish();
    }

    public final void aq(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        ax(i, i2 - 1);
    }

    @Override // defpackage.diez, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        super.finish();
        if (fszj.a.a().a() && this.u) {
            overridePendingTransition(0, R.anim.fade_out);
        }
    }

    @Override // defpackage.diez, defpackage.edmf
    public final Account kW() {
        return this.h.b.b;
    }

    @Override // defpackage.diez, defpackage.difg
    public final BuyFlowConfig l() {
        return this.h;
    }

    @Override // defpackage.diez, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 501) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            this.y = 4;
            ap();
        } else if (i2 == 0) {
            this.y = 3;
            aC(3);
        } else {
            this.y = 5;
            aq(8, 1023);
        }
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.m = (Bundle) bundle.getParcelable("extras");
        } else {
            Intent intent = getIntent();
            if (intent.hasExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras")) {
                this.m = (Bundle) diyf.b(Bundle.CREATOR, getIntent().getStringExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras"));
            } else {
                this.m = intent.getExtras();
            }
        }
        this.m.setClassLoader(IbChimeraActivity.class.getClassLoader());
        Bundle bundle2 = (Bundle) this.m.getParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS");
        arwm.t(bundle2, "activityParams is required");
        if (bundle != null) {
            this.h = (BuyFlowConfig) efph.c(bundle, "buyFlowConfig");
            this.i = (IbBuyFlowInput) efph.c(bundle, "buyFlowInput");
            this.y = emee.a(bundle.getInt("lockscreenStatus"));
            this.j = (WidgetConfig) bundle.getParcelable("widgetConfig");
        } else {
            this.h = (BuyFlowConfig) efph.c(this.m, "com.google.android.gms.wallet.buyFlowConfig");
            this.i = (IbBuyFlowInput) efph.c(bundle2, "com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory");
            this.y = 2;
        }
        this.k = (IbMerchantParameters) bundle2.getParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters");
        this.o = bundle2.getString("apiCallAnalyticsSessionId");
        q(bundle, true, 4, emen.FLOW_TYPE_BUYFLOW);
        ding.C(this, this.h, ding.d, true);
        super.onCreate(bundle);
        setContentView(com.google.android.gms.R.layout.wallet_activity_checkout);
        kJ().o(true);
        PopoverView popoverView = (PopoverView) findViewById(com.google.android.gms.R.id.popover);
        this.v = popoverView;
        if (popoverView != null) {
            PopoverView.c(this);
            PopoverView popoverView2 = this.v;
            popoverView2.f = this;
            ApplicationParameters applicationParameters = this.h.b;
            popoverView2.j(applicationParameters.h, applicationParameters.i);
        }
        ding.A(findViewById(com.google.android.gms.R.id.wallet_root));
        if (bundle != null) {
            this.n = (ProcessBuyFlowResultResponse) bundle.getParcelable("processBuyFlowResultResponse");
            this.r = bundle.getInt("serviceConnectionSavePoint");
            this.p = bundle.getBoolean("hasAuthTokens");
            this.q = bundle.getBoolean("processingBuyflowResult");
            this.u = bundle.getBoolean("shouldOverrideExitAnimation");
            this.x = (dijq) m();
        } else {
            this.n = null;
            this.r = -1;
            this.p = false;
            this.q = false;
            byte[] byteArray = this.m.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN");
            if (this.m.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                this.x = dijq.aA(this.m.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), this.i.H(), this.i.I(), null, this.h, this.a, byteArray, this.b);
            } else {
                this.x = dijq.aB(this.i.H(), this.i.I(), null, this.h, this.a, byteArray, this.b);
            }
            au();
            B(this.x, com.google.android.gms.R.id.popover_content_holder);
        }
        az();
        dijq dijqVar = this.x;
        dijqVar.t = this;
        dijqVar.u = this;
        int i = diuu.b;
        ednp d = ednp.d(this);
        if (d == null) {
            diuu diuuVar = new diuu();
            ednp.c.put(this, diuuVar);
            getSupportFragmentManager().beginTransaction().add(diuuVar, "ActionExecutorFragment").commit();
        } else if (!diuu.class.equals(d.getClass())) {
            throw new IllegalStateException("Trying to install multiple distinct subclasses of ActionExecutorFragment!");
        }
        ednp d2 = ednp.d(this);
        edup.b(d2, "BE_AEFT_01", null, eduq.a, "Activity has no ActionExecutorFragment!");
        this.w = new edoa(d2, this, bundle);
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        this.w.aX();
    }

    @Override // defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        ay();
        this.w.aY();
    }

    @Override // defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        dimf dimfVar = (dimf) getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (dimfVar != null) {
            dimfVar.d(this);
        }
        as();
        this.w.ba();
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ay();
        this.w.kA(bundle);
        bundle.putParcelable("extras", this.m);
        bundle.putParcelable("processBuyFlowResultResponse", this.n);
        bundle.putBoolean("processingBuyflowResult", this.q);
        bundle.putInt("serviceConnectionSavePoint", this.r);
        bundle.putParcelable("buyFlowConfig", this.h);
        bundle.putParcelable("buyFlowInput", this.i);
        int i = this.y;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bundle.putInt("lockscreenStatus", i2);
        bundle.putBoolean("shouldOverrideExitAnimation", this.u);
    }

    @Override // defpackage.diez, defpackage.djew
    public final void t(Account account) {
        ay();
        if (ab() != null) {
            getSupportFragmentManager().beginTransaction().remove(this.A).commit();
            getSupportFragmentManager().executePendingTransactions();
            this.A = null;
        }
        at();
        this.r = -1;
        this.l = new diqx(this);
        djdf b = ApplicationParameters.b(this.h.b);
        b.d(account);
        ApplicationParameters applicationParameters = b.a;
        djdh b2 = BuyFlowConfig.b(this.h);
        b2.b(applicationParameters);
        this.h = b2.a();
        divi.a(this, new OwMwAccountChangedEvent(this.o, account.name));
        this.p = false;
        au();
        az();
        as();
        ditw ditwVar = ab().b;
        Message.obtain(ditwVar.u, 38, this.i).sendToTarget();
    }

    @Override // defpackage.diez, defpackage.djew
    public final void v(WalletExitResult walletExitResult) {
        ar(walletExitResult);
    }

    @Override // defpackage.diez, defpackage.djew
    public final void x(WalletExitResult walletExitResult) {
        aB(9);
    }

    @Override // defpackage.diez, defpackage.djew
    public final /* bridge */ /* synthetic */ void z(Parcelable parcelable, boolean z2) {
        BuyFlowResult buyFlowResult = (BuyFlowResult) parcelable;
        ehlq ak = ak(buyFlowResult);
        if ((ak.b & 1) != 0) {
            ehlf ehlfVar = ak.c;
            if (ehlfVar == null) {
                ehlfVar = ehlf.a;
            }
            aw(ehlfVar);
            return;
        }
        this.q = true;
        ditw ditwVar = ab().b;
        Message.obtain(ditwVar.u, 35, new ProcessBuyFlowResultRequest(this.i, this.k, buyFlowResult.e, buyFlowResult.d, buyFlowResult.f)).sendToTarget();
    }

    @Override // defpackage.dils
    public final void ag() {
    }
}
