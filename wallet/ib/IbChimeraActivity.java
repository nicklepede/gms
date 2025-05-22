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
import defpackage.athr;
import defpackage.atzb;
import defpackage.auur;
import defpackage.dkox;
import defpackage.dkph;
import defpackage.dkqk;
import defpackage.dkup;
import defpackage.dkva;
import defpackage.dkvu;
import defpackage.dkwk;
import defpackage.dkxd;
import defpackage.dkxo;
import defpackage.dkxq;
import defpackage.dkxr;
import defpackage.dkyr;
import defpackage.dkzn;
import defpackage.dlci;
import defpackage.dlfh;
import defpackage.dlfo;
import defpackage.dlgf;
import defpackage.dlgt;
import defpackage.dljb;
import defpackage.dljy;
import defpackage.dloy;
import defpackage.dlpa;
import defpackage.dlpc;
import defpackage.dlph;
import defpackage.dlpk;
import defpackage.dlpl;
import defpackage.dlpn;
import defpackage.dlqw;
import defpackage.egal;
import defpackage.egaw;
import defpackage.egbp;
import defpackage.eghq;
import defpackage.eghr;
import defpackage.ehnw;
import defpackage.ehqn;
import defpackage.eick;
import defpackage.ejyk;
import defpackage.ejyl;
import defpackage.ejyw;
import defpackage.eori;
import defpackage.eorp;
import defpackage.eorq;
import defpackage.eors;
import defpackage.eort;
import defpackage.eosb;
import defpackage.fdcg;
import defpackage.fdch;
import defpackage.fdcj;
import defpackage.fdck;
import defpackage.fddz;
import defpackage.fdgb;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgtg;
import defpackage.fvva;
import defpackage.fvwe;
import defpackage.fvwh;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IbChimeraActivity extends dkqk implements dkxo, dkxd {
    private static final String z = dkxr.b("ibActivity");
    private dkxr A;
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
    public dlpn s;
    public long t;
    PopoverView v;
    public egaw w;
    public dkva x;
    dlfo l = new dlci(this);
    boolean u = false;
    int y = 1;

    public static Intent Z(BuyFlowConfig buyFlowConfig, byte[] bArr, byte[] bArr2, IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, String str) {
        atzb.t(buyFlowConfig, "buyFlowConfig is required");
        atzb.t(ibBuyFlowInput, "buyFlowInput is required");
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        if (bArr != null && bArr.length > 0) {
            bundle.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
        }
        bundle.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN", bArr2);
        bundle.putParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS", aa(ibBuyFlowInput, ibMerchantParameters, str, null));
        Intent intent = new Intent("com.google.android.gms.wallet.ib.INSTANT_BUY");
        intent.setClassName(athr.a(), "com.google.android.gms.wallet.ib.IbActivity");
        if (fvwe.a.lK().a()) {
            intent.putExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras", dljy.c(bundle));
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
        ehnw.r(this.b, dkwk.a(i), i2);
        AnalyticsIntentOperation.b(this, new OrchestrationClosedEvent(i, i2, i4, ll().name, this.a));
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
            fgrc v = eorp.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            eorp eorpVar = (eorp) fgriVar;
            eorpVar.c = i15;
            eorpVar.b |= 1;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            eorp eorpVar2 = (eorp) fgriVar2;
            eorpVar2.b = 2 | eorpVar2.b;
            eorpVar2.d = i2;
            if (!fgriVar2.L()) {
                v.U();
            }
            eorp eorpVar3 = (eorp) v.b;
            eorpVar3.b |= 4;
            eorpVar3.e = i3;
            if (this.i.m() != null) {
                String m2 = this.i.m();
                if (!v.b.L()) {
                    v.U();
                }
                eorp eorpVar4 = (eorp) v.b;
                m2.getClass();
                eorpVar4.b |= 8;
                eorpVar4.f = m2;
            }
            fddz v2 = dljb.v(this.i);
            if (!v.b.L()) {
                v.U();
            }
            eorp eorpVar5 = (eorp) v.b;
            v2.getClass();
            eorpVar5.g = v2;
            eorpVar5.b |= 16;
            LoadPaymentDataCallEvent.b(this, buyFlowConfig4, (eorp) v.Q(), this.k.d);
            return;
        }
        int i16 = i - 1;
        BuyFlowConfig buyFlowConfig5 = this.h;
        fgrc v3 = eorq.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar3 = v3.b;
        eorq eorqVar = (eorq) fgriVar3;
        eorqVar.c = i16;
        eorqVar.b |= 1;
        if (!fgriVar3.L()) {
            v3.U();
        }
        fgri fgriVar4 = v3.b;
        eorq eorqVar2 = (eorq) fgriVar4;
        eorqVar2.b = 2 | eorqVar2.b;
        eorqVar2.d = i2;
        if (!fgriVar4.L()) {
            v3.U();
        }
        eorq eorqVar3 = (eorq) v3.b;
        eorqVar3.b |= 4;
        eorqVar3.e = i3;
        if (this.i.m() != null) {
            String m3 = this.i.m();
            if (!v3.b.L()) {
                v3.U();
            }
            eorq eorqVar4 = (eorq) v3.b;
            m3.getClass();
            eorqVar4.b |= 8;
            eorqVar4.f = m3;
        }
        int i17 = this.y;
        if (!v3.b.L()) {
            v3.U();
        }
        eorq eorqVar5 = (eorq) v3.b;
        int i18 = i17 - 1;
        if (i17 == 0) {
            throw null;
        }
        eorqVar5.g = i18;
        eorqVar5.b |= 16;
        fddz w = dljb.w(((fdgb) this.i.e.b).e);
        if (w != null) {
            if (!v3.b.L()) {
                v3.U();
            }
            eorq eorqVar6 = (eorq) v3.b;
            eorqVar6.i = w;
            eorqVar6.b |= 64;
        }
        String a = dkzn.a(this.i.n());
        if (!v3.b.L()) {
            v3.U();
        }
        eorq eorqVar7 = (eorq) v3.b;
        eorqVar7.b |= 32;
        eorqVar7.h = a;
        LoadWebPaymentDataCallEvent.b(this, buyFlowConfig5, (eorq) v3.Q(), this.h.b.b.name, this.k.d);
    }

    private final void aB(int i) {
        this.u = true;
        if (i == 7) {
            ao(7);
            return;
        }
        if (m() == null || !((dkva) m()).aw()) {
            if (i == 9) {
                aq(8, 1061);
                return;
            } else {
                aC(i);
                return;
            }
        }
        byte[] ay = ((dkva) m()).ay();
        if (ay.length == 0) {
            ao(8);
        } else {
            aw((ejyl) ehqn.c(ay, (fgtg) ejyl.a.iQ(7, null)));
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

    public static Bundle aa(IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, String str, eori eoriVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory", ibBuyFlowInput);
        bundle.putParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters", ibMerchantParameters);
        bundle.putString("apiCallAnalyticsSessionId", str);
        if (fvwh.j() && eoriVar != null) {
            bundle.putByteArray("com.google.android.gms.wallet.ib.IbActivity.loggingInfo", eoriVar.r());
        }
        return bundle;
    }

    public static ejyw ak(BuyFlowResult buyFlowResult) {
        ejyw ejywVar = ejyw.a;
        byte[] bArr = buyFlowResult.d;
        return bArr != null ? (ejyw) ehqn.c(bArr, (fgtg) ejywVar.iQ(7, null)) : ejywVar;
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
        dkxq a = dkxq.a(ll(), dlpc.e(this.h.b));
        a.d(this);
        getSupportFragmentManager().beginTransaction().add(a, "RetrieveAuthTokensFragment").commit();
    }

    private final void av(WalletExitResult walletExitResult) {
        aD(walletExitResult, 1);
    }

    private final void aw(ejyl ejylVar) {
        if (!auur.d(ejylVar.d)) {
            dljb.M(this.i.l(), ejylVar.d);
        }
        int a = ejyk.a(ejylVar.b);
        if (a == 0) {
            a = 1;
        }
        ExecutorService executorService = dljb.a;
        ax(dljb.af(a), ejylVar.c);
    }

    private final void ax(int i, int i2) {
        aA(5, i, i2, 9);
        Intent intent = new Intent();
        int N = this.i.N() - 1;
        if (N == 1 || N == 3) {
            dkph a = MaskedWallet.a();
            a.a(this.i.m());
            a.b(this.k.b);
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", a.a);
        } else if (N == 4) {
            dkox a2 = FullWallet.a();
            a2.a(this.i.m());
            a2.b(this.k.b);
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", a2.a);
        }
        dkvu.b(this.h, intent, i);
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
            this.A = dkxr.a(8, this.h, ll());
            getSupportFragmentManager().beginTransaction().add(this.A, z).commit();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    @Override // defpackage.dkqk
    public final void A(WalletExitResult walletExitResult) {
        if (this.q) {
            ar(walletExitResult);
        } else {
            super.A(walletExitResult);
        }
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void X(int i) {
        this.v.p(i);
    }

    final dkxr ab() {
        if (this.A == null) {
            this.A = (dkxr) getSupportFragmentManager().findFragmentByTag(z);
        }
        return this.A;
    }

    @Override // defpackage.dkxo
    public final void ac() {
        aq(409, 1038);
    }

    @Override // defpackage.dkxo
    public final void ad(int i) {
        aq(409, 1039);
    }

    @Override // defpackage.dkxo
    public final void ae() {
        at();
    }

    @Override // defpackage.dkxd
    public final void af(WalletExitResult walletExitResult) {
        this.u = true;
        if (walletExitResult.c() == 7) {
            av(walletExitResult);
            return;
        }
        if (m() != null && ((dkva) m()).aw()) {
            byte[] ay = ((dkva) m()).ay();
            if (ay.length == 0) {
                av(walletExitResult);
                return;
            } else {
                aw((ejyl) ehqn.c(ay, (fgtg) ejyl.a.iQ(7, null)));
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

    @Override // defpackage.dkxd
    public final void ah() {
        if (m() != null) {
            ((dkva) m()).al();
        }
    }

    @Override // defpackage.dkxd
    public final void ai() {
        dlqw b = WalletExitResult.b();
        b.c(0);
        b.d(401);
        b.b(3);
        A(b.a);
    }

    public final WidgetConfig aj() {
        if (this.j == null) {
            this.j = dkup.a(this.h, getApplicationContext(), 2, null, Long.valueOf(UUID.randomUUID().getLeastSignificantBits()));
        }
        return this.j;
    }

    @Override // defpackage.dkxd
    public final void al(int i) {
        aB(i);
    }

    public final void am(eort eortVar) {
        Context applicationContext = getApplicationContext();
        BuyFlowConfig buyFlowConfig = this.h;
        SimpleAnalyticsEvent.b(applicationContext, buyFlowConfig, eortVar, buyFlowConfig.b.b);
    }

    public final void an(fdck fdckVar) {
        try {
            fgrc v = dlph.a.v();
            dlpk dlpkVar = dlpk.CALLBACK_TYPE_PAYMENT_DATA_CHANGE;
            if (!v.b.L()) {
                v.U();
            }
            ((dlph) v.b).b = dlpkVar.a();
            ExecutorService executorService = dljb.a;
            JSONObject jSONObject = new JSONObject();
            for (fdch fdchVar : fdckVar.c) {
                JSONObject jSONObject2 = new JSONObject(fdchVar.d);
                int a = fdcg.a(fdchVar.c);
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
            fdcj b = fdcj.b(fdckVar.d);
            if (b == null) {
                b = fdcj.UNKNOWN_CALLBACK_TRIGGER;
            }
            jSONObject.put("callbackTrigger", b.name());
            fgrc v2 = dlpl.a.v();
            String jSONObject3 = jSONObject.toString();
            if (!v2.b.L()) {
                v2.U();
            }
            dlpl dlplVar = (dlpl) v2.b;
            jSONObject3.getClass();
            dlplVar.b = jSONObject3;
            Bundle bundle = this.i.a;
            if (bundle != null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                fgpr w = fgpr.w(marshall);
                if (!v2.b.L()) {
                    v2.U();
                }
                ((dlpl) v2.b).c = w;
            }
            fgpr nD = ((dlpl) v2.Q()).nD();
            if (!v.b.L()) {
                v.U();
            }
            ((dlph) v.b).c = nD;
            this.t = SystemClock.elapsedRealtime();
            this.w.b(egbp.b((dlph) v.Q(), this.h.c, aj()));
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
            int a = dkvu.a(this.h, processBuyFlowResultResponse.c);
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

    @Override // defpackage.dkqk, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        super.finish();
        if (fvva.a.lK().a() && this.u) {
            overridePendingTransition(0, R.anim.fade_out);
        }
    }

    @Override // defpackage.dkqk, defpackage.dkqr
    public final BuyFlowConfig l() {
        return this.h;
    }

    @Override // defpackage.dkqk, defpackage.efzb
    public final Account ll() {
        return this.h.b.b;
    }

    @Override // defpackage.dkqk, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.m = (Bundle) bundle.getParcelable("extras");
        } else {
            Intent intent = getIntent();
            if (intent.hasExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras")) {
                this.m = (Bundle) dljy.b(Bundle.CREATOR, getIntent().getStringExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras"));
            } else {
                this.m = intent.getExtras();
            }
        }
        this.m.setClassLoader(IbChimeraActivity.class.getClassLoader());
        Bundle bundle2 = (Bundle) this.m.getParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS");
        atzb.t(bundle2, "activityParams is required");
        if (bundle != null) {
            this.h = (BuyFlowConfig) eick.c(bundle, "buyFlowConfig");
            this.i = (IbBuyFlowInput) eick.c(bundle, "buyFlowInput");
            this.y = eors.a(bundle.getInt("lockscreenStatus"));
            this.j = (WidgetConfig) bundle.getParcelable("widgetConfig");
        } else {
            this.h = (BuyFlowConfig) eick.c(this.m, "com.google.android.gms.wallet.buyFlowConfig");
            this.i = (IbBuyFlowInput) eick.c(bundle2, "com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory");
            this.y = 2;
        }
        this.k = (IbMerchantParameters) bundle2.getParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters");
        this.o = bundle2.getString("apiCallAnalyticsSessionId");
        q(bundle, true, 4, eosb.FLOW_TYPE_BUYFLOW);
        dkyr.C(this, this.h, dkyr.d, true);
        super.onCreate(bundle);
        setContentView(com.google.android.gms.R.layout.wallet_activity_checkout);
        kY().o(true);
        PopoverView popoverView = (PopoverView) findViewById(com.google.android.gms.R.id.popover);
        this.v = popoverView;
        if (popoverView != null) {
            PopoverView.c(this);
            PopoverView popoverView2 = this.v;
            popoverView2.f = this;
            ApplicationParameters applicationParameters = this.h.b;
            popoverView2.j(applicationParameters.h, applicationParameters.i);
        }
        dkyr.A(findViewById(com.google.android.gms.R.id.wallet_root));
        if (bundle != null) {
            this.n = (ProcessBuyFlowResultResponse) bundle.getParcelable("processBuyFlowResultResponse");
            this.r = bundle.getInt("serviceConnectionSavePoint");
            this.p = bundle.getBoolean("hasAuthTokens");
            this.q = bundle.getBoolean("processingBuyflowResult");
            this.u = bundle.getBoolean("shouldOverrideExitAnimation");
            this.x = (dkva) m();
        } else {
            this.n = null;
            this.r = -1;
            this.p = false;
            this.q = false;
            byte[] byteArray = this.m.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN");
            if (this.m.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                this.x = dkva.az(this.m.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), this.i.H(), this.i.I(), null, this.h, this.a, byteArray, this.b);
            } else {
                this.x = dkva.aA(this.i.H(), this.i.I(), null, this.h, this.a, byteArray, this.b);
            }
            au();
            B(this.x, com.google.android.gms.R.id.popover_content_holder);
        }
        az();
        dkva dkvaVar = this.x;
        dkvaVar.t = this;
        dkvaVar.u = this;
        int i = dlgf.b;
        egal d = egal.d(this);
        if (d == null) {
            dlgf dlgfVar = new dlgf();
            egal.c.put(this, dlgfVar);
            getSupportFragmentManager().beginTransaction().add(dlgfVar, "ActionExecutorFragment").commit();
        } else if (!dlgf.class.equals(d.getClass())) {
            throw new IllegalStateException("Trying to install multiple distinct subclasses of ActionExecutorFragment!");
        }
        egal d2 = egal.d(this);
        eghq.b(d2, "BE_AEFT_01", null, eghr.a, "Activity has no ActionExecutorFragment!");
        this.w = new egaw(d2, this, bundle);
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        this.w.aX();
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        ay();
        this.w.aY();
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        dkxq dkxqVar = (dkxq) getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (dkxqVar != null) {
            dkxqVar.d(this);
        }
        as();
        this.w.ba();
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ay();
        this.w.kP(bundle);
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

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void t(Account account) {
        ay();
        if (ab() != null) {
            getSupportFragmentManager().beginTransaction().remove(this.A).commit();
            getSupportFragmentManager().executePendingTransactions();
            this.A = null;
        }
        at();
        this.r = -1;
        this.l = new dlci(this);
        dloy b = ApplicationParameters.b(this.h.b);
        b.d(account);
        ApplicationParameters applicationParameters = b.a;
        dlpa b2 = BuyFlowConfig.b(this.h);
        b2.b(applicationParameters);
        this.h = b2.a();
        dlgt.a(this, new OwMwAccountChangedEvent(this.o, account.name));
        this.p = false;
        au();
        az();
        as();
        dlfh dlfhVar = ab().b;
        Message.obtain(dlfhVar.u, 38, this.i).sendToTarget();
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void v(WalletExitResult walletExitResult) {
        ar(walletExitResult);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void x(WalletExitResult walletExitResult) {
        aB(9);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final /* bridge */ /* synthetic */ void z(Parcelable parcelable, boolean z2) {
        BuyFlowResult buyFlowResult = (BuyFlowResult) parcelable;
        ejyw ak = ak(buyFlowResult);
        if ((ak.b & 1) != 0) {
            ejyl ejylVar = ak.c;
            if (ejylVar == null) {
                ejylVar = ejyl.a;
            }
            aw(ejylVar);
            return;
        }
        this.q = true;
        dlfh dlfhVar = ab().b;
        Message.obtain(dlfhVar.u, 35, new ProcessBuyFlowResultRequest(this.i, this.k, buyFlowResult.e, buyFlowResult.d, buyFlowResult.f)).sendToTarget();
    }

    @Override // defpackage.dkxd
    public final void ag() {
    }
}
