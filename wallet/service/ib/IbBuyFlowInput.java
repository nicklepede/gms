package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arwm;
import defpackage.dioc;
import defpackage.diqy;
import defpackage.diwu;
import defpackage.dixi;
import defpackage.dixj;
import defpackage.efcx;
import defpackage.efdk;
import defpackage.ehkz;
import defpackage.ehla;
import defpackage.ehlc;
import defpackage.ehlk;
import defpackage.ehls;
import defpackage.ehlu;
import defpackage.ehlv;
import defpackage.ehrc;
import defpackage.ehwh;
import defpackage.ehwj;
import defpackage.ehwl;
import defpackage.ehwm;
import defpackage.faod;
import defpackage.faoe;
import defpackage.faoj;
import defpackage.faom;
import defpackage.faoq;
import defpackage.fapn;
import defpackage.farj;
import defpackage.farl;
import defpackage.farm;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fecz;
import defpackage.fedh;
import defpackage.feen;
import defpackage.feeq;
import defpackage.fehn;
import defpackage.fehq;
import defpackage.fsyo;
import defpackage.ftaq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IbBuyFlowInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = new diwu();
    public Bundle a;
    public ehkz b;
    public byte[] c;
    public byte[] d;
    public final fecj e;

    private IbBuyFlowInput(ehla ehlaVar, fecj fecjVar, byte[] bArr, byte[] bArr2) {
        fecj fecjVar2 = (fecj) ehlaVar.iB(5, null);
        fecjVar2.X(ehlaVar);
        ehkz ehkzVar = (ehkz) fecjVar2;
        this.b = ehkzVar;
        this.c = bArr;
        this.d = bArr2;
        if ((((ehla) ehkzVar.b).c & 32) == 0) {
            ehlk ehlkVar = ehlk.a;
            if (!ehkzVar.b.L()) {
                ehkzVar.U();
            }
            ehla ehlaVar2 = (ehla) ehkzVar.b;
            ehlkVar.getClass();
            ehlaVar2.j = ehlkVar;
            ehlaVar2.c |= 32;
        }
        this.e = fecjVar;
        if ((((farm) fecjVar.b).b & 1024) != 0) {
            return;
        }
        ehwh ehwhVar = (ehwh) ehwm.a.v();
        if (!ehwhVar.b.L()) {
            ehwhVar.U();
        }
        ehwm ehwmVar = (ehwm) ehwhVar.b;
        ehwmVar.b |= 1;
        ehwmVar.c = false;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        farm farmVar = (farm) fecjVar.b;
        ehwm ehwmVar2 = (ehwm) ehwhVar.Q();
        ehwmVar2.getClass();
        farmVar.m = ehwmVar2;
        farmVar.b |= 1024;
    }

    public static ehrc[] Q(boolean z, boolean z2, List list, int i) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(ehrc.CARD_CLASS_PREPAID);
        }
        if (!z2) {
            arrayList.add(ehrc.CARD_CLASS_DEBIT);
        }
        if (i == 3) {
            arrayList.add(ehrc.CARD_NETWORK_TOKEN_DISABLED);
        }
        if (list == null || list.isEmpty()) {
            list = diqy.a;
        }
        for (Map.Entry entry : dixi.b.entrySet()) {
            if (!list.contains(entry.getKey())) {
                arrayList.add(ehrc.b(((Integer) entry.getValue()).intValue()));
            }
        }
        return (ehrc[]) arrayList.toArray(new ehrc[arrayList.size()]);
    }

    public static final faoq R(JSONObject jSONObject, dixj dixjVar) {
        String am;
        faoj faojVar = (faoj) faoq.a.v();
        dixi o = dixi.o();
        ArrayList arrayList = null;
        if (jSONObject != null && dixi.e(jSONObject, dixjVar) >= 2) {
            ArrayList arrayList2 = new ArrayList();
            JSONObject jSONObject2 = (JSONObject) dixi.ah(jSONObject, "transactionInfo", JSONObject.class, 1074, dixjVar);
            String str = (String) dixi.ah(jSONObject2, "totalPriceStatus", String.class, 1090, dixjVar);
            if (jSONObject2 != null && str != null && ((str.equals("ESTIMATED") || str.equals("FINAL")) && (am = dixi.am(jSONObject2, "transactionInfo", dixjVar)) != null)) {
                String str2 = (String) dixi.ai(jSONObject2, "totalPrice", null, String.class, 1089, dixjVar);
                o.k(str2, "transactionInfo.totalPrice", dixjVar);
                if (dixjVar.a.isEmpty()) {
                    fecj v = faom.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    faom faomVar = (faom) fecpVar;
                    faomVar.b |= 4;
                    faomVar.e = am;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    fecp fecpVar2 = v.b;
                    faom faomVar2 = (faom) fecpVar2;
                    str2.getClass();
                    faomVar2.b = 2 | faomVar2.b;
                    faomVar2.d = str2;
                    if (!fecpVar2.L()) {
                        v.U();
                    }
                    faom faomVar3 = (faom) v.b;
                    faomVar3.f = 5;
                    faomVar3.b |= 8;
                    arrayList2.add((faom) v.Q());
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList != null) {
            faojVar.a(arrayList);
        }
        return (faoq) faojVar.Q();
    }

    public static IbBuyFlowInput c(feay feayVar) {
        return d(feayVar.M());
    }

    public static IbBuyFlowInput d(byte[] bArr) {
        fehn fehnVar = (fehn) efdk.c(bArr, (feen) fehn.a.iB(7, null));
        ehla ehlaVar = fehnVar.d;
        if (ehlaVar == null) {
            ehlaVar = ehla.b;
        }
        farm farmVar = fehnVar.c;
        if (farmVar == null) {
            farmVar = farm.a;
        }
        fecj fecjVar = (fecj) farmVar.iB(5, null);
        fecjVar.X(farmVar);
        return new IbBuyFlowInput(ehlaVar, fecjVar, fehnVar.e.M(), fehnVar.f.M());
    }

    public static IbBuyFlowInput e() {
        fecj v = farm.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        farm farmVar = (farm) fecpVar;
        farmVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        farmVar.p = true;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        farm farmVar2 = (farm) fecpVar2;
        farmVar2.b |= 32;
        farmVar2.h = false;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        farm farmVar3 = (farm) fecpVar3;
        farmVar3.b |= 128;
        farmVar3.j = false;
        if (!fecpVar3.L()) {
            v.U();
        }
        fecp fecpVar4 = v.b;
        farm farmVar4 = (farm) fecpVar4;
        farmVar4.b |= 16;
        farmVar4.g = false;
        if (!fecpVar4.L()) {
            v.U();
        }
        fecp fecpVar5 = v.b;
        farm farmVar5 = (farm) fecpVar5;
        farmVar5.b |= 2048;
        farmVar5.n = false;
        if (!fecpVar5.L()) {
            v.U();
        }
        farm farmVar6 = (farm) v.b;
        farmVar6.b |= 64;
        farmVar6.i = false;
        return new IbBuyFlowInput(ehla.b, v, null, null);
    }

    public static ehlv g(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
        if (paymentMethodTokenizationParameters == null) {
            return null;
        }
        fecj v = ehlv.a.v();
        int i = paymentMethodTokenizationParameters.a;
        if (i == 1) {
            if (!v.b.L()) {
                v.U();
            }
            ehlv ehlvVar = (ehlv) v.b;
            ehlvVar.c = 1;
            ehlvVar.b |= 1;
        } else if (i == 2) {
            if (!v.b.L()) {
                v.U();
            }
            ehlv ehlvVar2 = (ehlv) v.b;
            ehlvVar2.c = 2;
            ehlvVar2.b |= 1;
        } else if (i != 3) {
            if (!v.b.L()) {
                v.U();
            }
            ehlv ehlvVar3 = (ehlv) v.b;
            ehlvVar3.c = 0;
            ehlvVar3.b |= 1;
        } else {
            if (!v.b.L()) {
                v.U();
            }
            ehlv ehlvVar4 = (ehlv) v.b;
            ehlvVar4.c = 3;
            ehlvVar4.b |= 1;
        }
        Bundle a = paymentMethodTokenizationParameters.a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(a.keySet());
        Collections.sort(arrayList);
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            fecj v2 = ehls.a.v();
            String a2 = dioc.a(str);
            if (!v2.b.L()) {
                v2.U();
            }
            ehls ehlsVar = (ehls) v2.b;
            ehlsVar.b |= 1;
            ehlsVar.c = a2;
            String a3 = dioc.a(a.getString(str));
            if (!v2.b.L()) {
                v2.U();
            }
            ehls ehlsVar2 = (ehls) v2.b;
            ehlsVar2.b |= 2;
            ehlsVar2.d = a3;
            ehls ehlsVar3 = (ehls) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            ehlv ehlvVar5 = (ehlv) v.b;
            ehlsVar3.getClass();
            fedh fedhVar = ehlvVar5.d;
            if (!fedhVar.c()) {
                ehlvVar5.d = fecp.E(fedhVar);
            }
            ehlvVar5.d.add(ehlsVar3);
        }
        return (ehlv) v.Q();
    }

    public static faoe h(List list) {
        if (list == null) {
            return null;
        }
        fecj v = faoe.a.v();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fecj v2 = faod.a.v();
            String str = (String) list.get(i);
            if (str != null) {
                if (!v2.b.L()) {
                    v2.U();
                }
                faod faodVar = (faod) v2.b;
                faodVar.b |= 1;
                faodVar.c = str;
            }
            if (!v.b.L()) {
                v.U();
            }
            faoe faoeVar = (faoe) v.b;
            faod faodVar2 = (faod) v2.Q();
            faodVar2.getClass();
            faoeVar.b();
            faoeVar.b.add(faodVar2);
        }
        return (faoe) v.Q();
    }

    public static faoe i(JSONObject jSONObject, dixj dixjVar) {
        return dixi.e(jSONObject, dixjVar) == 1 ? dixi.t((JSONArray) dixi.ah((JSONObject) dixi.ah(jSONObject, "shippingAddressRequirements", JSONObject.class, 1097, dixjVar), "allowedCountryCodes", JSONArray.class, 1087, dixjVar)) : dixi.t((JSONArray) dixi.ah((JSONObject) dixi.ah(jSONObject, "shippingAddressParameters", JSONObject.class, 1086, dixjVar), "allowedCountryCodes", JSONArray.class, 1087, dixjVar));
    }

    public final void A(boolean z) {
        ehkz ehkzVar = this.b;
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar = (ehla) ehkzVar.b;
        fecz feczVar = ehla.a;
        ehlaVar.c |= 8;
        ehlaVar.g = z;
    }

    public final void B(boolean z) {
        ehkz ehkzVar = this.b;
        ehlk ehlkVar = ((ehla) ehkzVar.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        fecj fecjVar = (fecj) ehlkVar.iB(5, null);
        fecjVar.X(ehlkVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ehlk ehlkVar2 = (ehlk) fecjVar.b;
        ehlkVar2.b |= 512;
        ehlkVar2.l = z;
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar = (ehla) ehkzVar.b;
        ehlk ehlkVar3 = (ehlk) fecjVar.Q();
        ehlkVar3.getClass();
        ehlaVar.j = ehlkVar3;
        ehlaVar.c |= 32;
        fecj fecjVar2 = this.e;
        fecp fecpVar = fecjVar2.b;
        if (((farm) fecpVar).n) {
            if (!fecpVar.L()) {
                fecjVar2.U();
            }
            farm farmVar = (farm) fecjVar2.b;
            farmVar.b |= 64;
            farmVar.i = false;
            return;
        }
        if (!fecpVar.L()) {
            fecjVar2.U();
        }
        farm farmVar2 = (farm) fecjVar2.b;
        farmVar2.b |= 64;
        farmVar2.i = z;
    }

    public final void C(boolean z) {
        ehkz ehkzVar = this.b;
        ehlk ehlkVar = ((ehla) ehkzVar.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        fecj fecjVar = (fecj) ehlkVar.iB(5, null);
        fecjVar.X(ehlkVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ehlk ehlkVar2 = (ehlk) fecjVar.b;
        ehlkVar2.b |= 32;
        ehlkVar2.h = z;
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar = (ehla) ehkzVar.b;
        ehlk ehlkVar3 = (ehlk) fecjVar.Q();
        ehlkVar3.getClass();
        ehlaVar.j = ehlkVar3;
        ehlaVar.c |= 32;
    }

    public final void D(Bundle bundle) {
        if (bundle != null) {
            this.a = bundle;
        }
    }

    public final boolean E() {
        return ((farm) this.e.b).j;
    }

    public final boolean F() {
        ehwm ehwmVar = ((farm) this.e.b).m;
        if (ehwmVar == null) {
            ehwmVar = ehwm.a;
        }
        return !ehwmVar.c;
    }

    public final boolean G() {
        ehlk ehlkVar = ((ehla) this.b.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        return ehlkVar.h;
    }

    public final byte[] H() {
        byte[] bArr;
        if (!ftaq.f() || (bArr = this.c) == null || bArr.length <= 0) {
            return null;
        }
        return bArr;
    }

    public final byte[] I() {
        if (H() != null || J() != null) {
            return null;
        }
        fecj v = farj.a.v();
        fecj fecjVar = this.e;
        if (!v.b.L()) {
            v.U();
        }
        farj farjVar = (farj) v.b;
        farm farmVar = (farm) fecjVar.Q();
        farmVar.getClass();
        farjVar.c = farmVar;
        farjVar.b |= 1;
        farj farjVar2 = (farj) v.Q();
        ehla ehlaVar = (ehla) this.b.Q();
        fecj fecjVar2 = (fecj) ehlaVar.iB(5, null);
        fecjVar2.X(ehlaVar);
        ehkz ehkzVar = (ehkz) fecjVar2;
        feay ng = farjVar2.ng();
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar2 = (ehla) ehkzVar.b;
        fecz feczVar = ehla.a;
        ehlaVar2.c |= 2;
        ehlaVar2.e = ng;
        return ((ehla) ehkzVar.Q()).r();
    }

    public final byte[] J() {
        byte[] bArr;
        if (H() == null && ftaq.a.a().x() && (bArr = this.d) != null && bArr.length > 0) {
            return bArr;
        }
        return null;
    }

    public final byte[] K() {
        fecj v = fehn.a.v();
        ehkz ehkzVar = this.b;
        if (!v.b.L()) {
            v.U();
        }
        fehn fehnVar = (fehn) v.b;
        ehla ehlaVar = (ehla) ehkzVar.Q();
        ehlaVar.getClass();
        fehnVar.d = ehlaVar;
        fehnVar.b |= 2;
        fecj fecjVar = this.e;
        if (!v.b.L()) {
            v.U();
        }
        fehn fehnVar2 = (fehn) v.b;
        farm farmVar = (farm) fecjVar.Q();
        farmVar.getClass();
        fehnVar2.c = farmVar;
        fehnVar2.b |= 1;
        byte[] bArr = this.c;
        if (bArr == null || bArr.length <= 0) {
            byte[] bArr2 = this.d;
            if (bArr2 != null && bArr2.length > 0) {
                feay w = feay.w(bArr2);
                if (!v.b.L()) {
                    v.U();
                }
                fehn fehnVar3 = (fehn) v.b;
                fehnVar3.b |= 8;
                fehnVar3.f = w;
            }
        } else {
            feay w2 = feay.w(bArr);
            if (!v.b.L()) {
                v.U();
            }
            fehn fehnVar4 = (fehn) v.b;
            fehnVar4.b |= 4;
            fehnVar4.e = w2;
        }
        return ((fehn) v.Q()).r();
    }

    public final void L() {
        fecj fecjVar = this.e;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        farm farmVar = (farm) fecjVar.b;
        farm farmVar2 = farm.a;
        farmVar.b |= 4096;
        farmVar.o = true;
    }

    public final void M() {
        fecj fecjVar = this.e;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        farm farmVar = (farm) fecjVar.b;
        farm farmVar2 = farm.a;
        farmVar.b |= 2048;
        farmVar.n = true;
        P(N());
        ehlk ehlkVar = ((ehla) this.b.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        t(ehlkVar.k);
        ehlk ehlkVar2 = ((ehla) this.b.b).j;
        if (ehlkVar2 == null) {
            ehlkVar2 = ehlk.a;
        }
        B(ehlkVar2.l);
    }

    public final int N() {
        ehlk ehlkVar = ((ehla) this.b.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        int a = ehlc.a(ehlkVar.j);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int O() {
        ehlk ehlkVar = ((ehla) this.b.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        if ((ehlkVar.b & 8) == 0) {
            return 1;
        }
        ehlk ehlkVar2 = ((ehla) this.b.b).j;
        if (ehlkVar2 == null) {
            ehlkVar2 = ehlk.a;
        }
        ehlv ehlvVar = ehlkVar2.f;
        if (ehlvVar == null) {
            ehlvVar = ehlv.a;
        }
        int a = ehlu.a(ehlvVar.c);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final void P(int i) {
        ehkz ehkzVar = this.b;
        ehlk ehlkVar = ((ehla) ehkzVar.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        fecj fecjVar = (fecj) ehlkVar.iB(5, null);
        fecjVar.X(ehlkVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ehlk ehlkVar2 = (ehlk) fecjVar.b;
        int i2 = i - 1;
        ehlkVar2.j = i2;
        ehlkVar2.b |= 128;
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar = (ehla) ehkzVar.b;
        ehlk ehlkVar3 = (ehlk) fecjVar.Q();
        ehlkVar3.getClass();
        ehlaVar.j = ehlkVar3;
        ehlaVar.c |= 32;
        fecj fecjVar2 = this.e;
        fecp fecpVar = fecjVar2.b;
        if (((farm) fecpVar).n) {
            if (!fecpVar.L()) {
                fecjVar2.U();
            }
            farm farmVar = (farm) fecjVar2.b;
            farmVar.f = 0;
            farmVar.b |= 8;
            return;
        }
        if (!fecpVar.L()) {
            fecjVar2.U();
        }
        farm farmVar2 = (farm) fecjVar2.b;
        farmVar2.f = i2;
        farmVar2.b |= 8;
    }

    public final int a(String str) {
        ehwm ehwmVar = ((farm) this.e.b).m;
        if (ehwmVar == null) {
            ehwmVar = ehwm.a;
        }
        while (true) {
            int i = 1;
            for (ehwl ehwlVar : ehwmVar.d) {
                if (!str.equals(ehwlVar.c) || (i = ehwj.a(ehwlVar.d)) != 0) {
                }
            }
            return efcx.b(i);
        }
    }

    public final IbBuyFlowInput b() {
        ehla ehlaVar = (ehla) this.b.Q();
        farm farmVar = (farm) this.e.Q();
        fecj fecjVar = (fecj) farmVar.iB(5, null);
        fecjVar.X(farmVar);
        IbBuyFlowInput ibBuyFlowInput = new IbBuyFlowInput(ehlaVar, fecjVar, this.c, this.d);
        ibBuyFlowInput.D(this.a);
        return ibBuyFlowInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ehkz f(JSONObject jSONObject, String str, dixj dixjVar) {
        faoe i = i(jSONObject, dixjVar);
        if (i != null) {
            ehkz ehkzVar = this.b;
            if (!ehkzVar.b.L()) {
                ehkzVar.U();
            }
            ehla ehlaVar = (ehla) ehkzVar.b;
            fecz feczVar = ehla.a;
            ehlaVar.h = i;
            ehlaVar.c |= 16;
        } else {
            ehkz ehkzVar2 = this.b;
            if (!ehkzVar2.b.L()) {
                ehkzVar2.U();
            }
            ehla ehlaVar2 = (ehla) ehkzVar2.b;
            fecz feczVar2 = ehla.a;
            ehlaVar2.h = null;
            ehlaVar2.c &= -17;
        }
        ehkz ehkzVar3 = this.b;
        ehlk ehlkVar = ((ehla) ehkzVar3.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        fecj fecjVar = (fecj) ehlkVar.iB(5, null);
        fecjVar.X(ehlkVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ehlk ehlkVar2 = (ehlk) fecjVar.b;
        str.getClass();
        ehlkVar2.b |= 2048;
        ehlkVar2.o = str;
        if (!ehkzVar3.b.L()) {
            ehkzVar3.U();
        }
        ehla ehlaVar3 = (ehla) ehkzVar3.b;
        ehlk ehlkVar3 = (ehlk) fecjVar.Q();
        ehlkVar3.getClass();
        ehlaVar3.j = ehlkVar3;
        ehlaVar3.c |= 32;
        if (fsyo.c()) {
            ehkz ehkzVar4 = this.b;
            faoq R = R(jSONObject, dixjVar);
            if (!ehkzVar4.b.L()) {
                ehkzVar4.U();
            }
            ehla ehlaVar4 = (ehla) ehkzVar4.b;
            R.getClass();
            ehlaVar4.l = R;
            ehlaVar4.c |= 128;
        }
        return this.b;
    }

    public final fapn j() {
        ehlk ehlkVar = ((ehla) this.b.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        if ((ehlkVar.b & 16) == 0) {
            return null;
        }
        ehlk ehlkVar2 = ((ehla) this.b.b).j;
        if (ehlkVar2 == null) {
            ehlkVar2 = ehlk.a;
        }
        fapn fapnVar = ehlkVar2.g;
        return fapnVar == null ? fapn.a : fapnVar;
    }

    public final farj k() {
        fecj v = farj.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecj fecjVar = this.e;
        farj farjVar = (farj) v.b;
        farm farmVar = (farm) fecjVar.Q();
        farmVar.getClass();
        farjVar.c = farmVar;
        farjVar.b |= 1;
        return (farj) v.Q();
    }

    public final String l() {
        int N = N() - 1;
        return N != 3 ? N != 4 ? N != 5 ? N != 6 ? "loadMaskedWallet" : "loadPaymentData" : "loadWebPaymentData" : "loadFullWallet" : "changeMaskedWallet";
    }

    public final String m() {
        ehlk ehlkVar = ((ehla) this.b.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        return ehlkVar.c;
    }

    public final String n() {
        return ((farm) this.e.b).d;
    }

    public final String o() {
        return ((farm) this.e.b).k;
    }

    public final String p(String str) {
        ehlk ehlkVar = ((ehla) this.b.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        if ((ehlkVar.b & 8) == 0) {
            return null;
        }
        ehlv ehlvVar = ehlkVar.f;
        if (ehlvVar == null) {
            ehlvVar = ehlv.a;
        }
        for (ehls ehlsVar : ehlvVar.d) {
            if (str.equals(ehlsVar.c)) {
                return ehlsVar.d;
            }
        }
        return null;
    }

    public final void q(GetActiveCardsForAccountResponse getActiveCardsForAccountResponse) {
        if (getActiveCardsForAccountResponse == null) {
            fecj fecjVar = this.e;
            ehwm ehwmVar = ((farm) fecjVar.b).m;
            if (ehwmVar == null) {
                ehwmVar = ehwm.a;
            }
            fecj fecjVar2 = (fecj) ehwmVar.iB(5, null);
            fecjVar2.X(ehwmVar);
            ehwh ehwhVar = (ehwh) fecjVar2;
            if (!ehwhVar.b.L()) {
                ehwhVar.U();
            }
            ((ehwm) ehwhVar.b).d = feeq.a;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            farm farmVar = (farm) fecjVar.b;
            ehwm ehwmVar2 = (ehwm) ehwhVar.Q();
            ehwmVar2.getClass();
            farmVar.m = ehwmVar2;
            farmVar.b |= 1024;
            return;
        }
        fecj fecjVar3 = this.e;
        ehwm ehwmVar3 = ((farm) fecjVar3.b).m;
        if (ehwmVar3 == null) {
            ehwmVar3 = ehwm.a;
        }
        fecj fecjVar4 = (fecj) ehwmVar3.iB(5, null);
        fecjVar4.X(ehwmVar3);
        ehwh ehwhVar2 = (ehwh) fecjVar4;
        if (!ehwhVar2.b.L()) {
            ehwhVar2.U();
        }
        ((ehwm) ehwhVar2.b).d = feeq.a;
        ehwhVar2.a(dixi.E(getActiveCardsForAccountResponse.a));
        if (!fecjVar3.b.L()) {
            fecjVar3.U();
        }
        farm farmVar2 = (farm) fecjVar3.b;
        ehwm ehwmVar4 = (ehwm) ehwhVar2.Q();
        ehwmVar4.getClass();
        farmVar2.m = ehwmVar4;
        farmVar2.b |= 1024;
    }

    public final void r(fehq fehqVar) {
        fecj fecjVar = this.e;
        String str = fehqVar.d;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        farm farmVar = (farm) fecjVar.b;
        farm farmVar2 = farm.a;
        str.getClass();
        farmVar.b |= 256;
        farmVar.k = str;
        feay feayVar = fehqVar.e;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fecp fecpVar = fecjVar.b;
        farm farmVar3 = (farm) fecpVar;
        feayVar.getClass();
        farmVar3.b |= 512;
        farmVar3.l = feayVar;
        boolean z = fehqVar.f;
        if (!fecpVar.L()) {
            fecjVar.U();
        }
        farm farmVar4 = (farm) fecjVar.b;
        farmVar4.b |= 128;
        farmVar4.j = z;
    }

    public final void s(farl farlVar) {
        fecj fecjVar = this.e;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        farm farmVar = (farm) fecjVar.b;
        farm farmVar2 = farm.a;
        farlVar.getClass();
        farmVar.c = farlVar;
        farmVar.b |= 1;
    }

    public final void t(boolean z) {
        ehkz ehkzVar = this.b;
        ehlk ehlkVar = ((ehla) ehkzVar.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        fecj fecjVar = (fecj) ehlkVar.iB(5, null);
        fecjVar.X(ehlkVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ehlk ehlkVar2 = (ehlk) fecjVar.b;
        ehlkVar2.b |= 256;
        ehlkVar2.k = z;
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar = (ehla) ehkzVar.b;
        ehlk ehlkVar3 = (ehlk) fecjVar.Q();
        ehlkVar3.getClass();
        ehlaVar.j = ehlkVar3;
        ehlaVar.c |= 32;
        fecj fecjVar2 = this.e;
        fecp fecpVar = fecjVar2.b;
        if (((farm) fecpVar).n) {
            if (!fecpVar.L()) {
                fecjVar2.U();
            }
            farm farmVar = (farm) fecjVar2.b;
            farmVar.b |= 32;
            farmVar.h = false;
            return;
        }
        if (!fecpVar.L()) {
            fecjVar2.U();
        }
        farm farmVar2 = (farm) fecjVar2.b;
        farmVar2.b |= 32;
        farmVar2.h = z;
    }

    public final void u(String str) {
        ehkz ehkzVar = this.b;
        ehlk ehlkVar = ((ehla) ehkzVar.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        fecj fecjVar = (fecj) ehlkVar.iB(5, null);
        fecjVar.X(ehlkVar);
        arwm.s(str);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ehlk ehlkVar2 = (ehlk) fecjVar.b;
        ehlkVar2.b |= 1;
        ehlkVar2.c = str;
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar = (ehla) ehkzVar.b;
        ehlk ehlkVar3 = (ehlk) fecjVar.Q();
        ehlkVar3.getClass();
        ehlaVar.j = ehlkVar3;
        ehlaVar.c |= 32;
    }

    public final void v(boolean z) {
        fecj fecjVar = this.e;
        ehwm ehwmVar = ((farm) fecjVar.b).m;
        if (ehwmVar == null) {
            ehwmVar = ehwm.a;
        }
        fecj fecjVar2 = (fecj) ehwmVar.iB(5, null);
        fecjVar2.X(ehwmVar);
        ehwh ehwhVar = (ehwh) fecjVar2;
        boolean z2 = !z;
        if (!ehwhVar.b.L()) {
            ehwhVar.U();
        }
        ehwm ehwmVar2 = (ehwm) ehwhVar.b;
        ehwmVar2.b |= 1;
        ehwmVar2.c = z2;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        farm farmVar = (farm) fecjVar.b;
        ehwm ehwmVar3 = (ehwm) ehwhVar.Q();
        ehwmVar3.getClass();
        farmVar.m = ehwmVar3;
        farmVar.b |= 1024;
    }

    public final void w(boolean z) {
        fecj fecjVar = this.e;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        farm farmVar = (farm) fecjVar.b;
        farm farmVar2 = farm.a;
        farmVar.b |= 16;
        farmVar.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(K());
        parcel.writeBundle(this.a);
    }

    public final void x(fapn fapnVar) {
        if (fapnVar != null) {
            ehkz ehkzVar = this.b;
            ehlk ehlkVar = ((ehla) ehkzVar.b).j;
            if (ehlkVar == null) {
                ehlkVar = ehlk.a;
            }
            fecj fecjVar = (fecj) ehlkVar.iB(5, null);
            fecjVar.X(ehlkVar);
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ehlk ehlkVar2 = (ehlk) fecjVar.b;
            ehlkVar2.g = fapnVar;
            ehlkVar2.b |= 16;
            if (!ehkzVar.b.L()) {
                ehkzVar.U();
            }
            ehla ehlaVar = (ehla) ehkzVar.b;
            ehlk ehlkVar3 = (ehlk) fecjVar.Q();
            ehlkVar3.getClass();
            ehlaVar.j = ehlkVar3;
            ehlaVar.c |= 32;
        }
    }

    public final void y(int i) {
        ehkz ehkzVar = this.b;
        ehlk ehlkVar = ((ehla) ehkzVar.b).j;
        if (ehlkVar == null) {
            ehlkVar = ehlk.a;
        }
        fecj fecjVar = (fecj) ehlkVar.iB(5, null);
        fecjVar.X(ehlkVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ehlk ehlkVar2 = (ehlk) fecjVar.b;
        ehlkVar2.b |= 64;
        ehlkVar2.i = i;
        if (!ehkzVar.b.L()) {
            ehkzVar.U();
        }
        ehla ehlaVar = (ehla) ehkzVar.b;
        ehlk ehlkVar3 = (ehlk) fecjVar.Q();
        ehlkVar3.getClass();
        ehlaVar.j = ehlkVar3;
        ehlaVar.c |= 32;
    }

    public final void z(PaymentDataRequest paymentDataRequest) {
        ehlv g = g(paymentDataRequest.g);
        if (g != null) {
            ehkz ehkzVar = this.b;
            ehlk ehlkVar = ((ehla) ehkzVar.b).j;
            if (ehlkVar == null) {
                ehlkVar = ehlk.a;
            }
            fecj fecjVar = (fecj) ehlkVar.iB(5, null);
            fecjVar.X(ehlkVar);
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ehlk ehlkVar2 = (ehlk) fecjVar.b;
            ehlkVar2.f = g;
            ehlkVar2.b |= 8;
            if (!ehkzVar.b.L()) {
                ehkzVar.U();
            }
            ehla ehlaVar = (ehla) ehkzVar.b;
            ehlk ehlkVar3 = (ehlk) fecjVar.Q();
            ehlkVar3.getClass();
            ehlaVar.j = ehlkVar3;
            ehlaVar.c |= 32;
            return;
        }
        ehkz ehkzVar2 = this.b;
        ehlk ehlkVar4 = ((ehla) ehkzVar2.b).j;
        if (ehlkVar4 == null) {
            ehlkVar4 = ehlk.a;
        }
        fecj fecjVar2 = (fecj) ehlkVar4.iB(5, null);
        fecjVar2.X(ehlkVar4);
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        ehlk ehlkVar5 = (ehlk) fecjVar2.b;
        ehlkVar5.f = null;
        ehlkVar5.b &= -9;
        if (!ehkzVar2.b.L()) {
            ehkzVar2.U();
        }
        ehla ehlaVar2 = (ehla) ehkzVar2.b;
        ehlk ehlkVar6 = (ehlk) fecjVar2.Q();
        ehlkVar6.getClass();
        ehlaVar2.j = ehlkVar6;
        ehlaVar2.c |= 32;
    }
}
