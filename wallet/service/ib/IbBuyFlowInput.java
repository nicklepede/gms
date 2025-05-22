package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.atzb;
import defpackage.dkzn;
import defpackage.dlcj;
import defpackage.dlif;
import defpackage.dljb;
import defpackage.dljc;
import defpackage.ehqa;
import defpackage.ehqn;
import defpackage.ejyf;
import defpackage.ejyg;
import defpackage.ejyi;
import defpackage.ejyq;
import defpackage.ejyy;
import defpackage.ejza;
import defpackage.ejzb;
import defpackage.ekei;
import defpackage.ekjn;
import defpackage.ekjp;
import defpackage.ekjr;
import defpackage.ekjs;
import defpackage.fdcs;
import defpackage.fdct;
import defpackage.fdcy;
import defpackage.fddb;
import defpackage.fddf;
import defpackage.fdec;
import defpackage.fdfy;
import defpackage.fdga;
import defpackage.fdgb;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgrs;
import defpackage.fgsa;
import defpackage.fgtg;
import defpackage.fgtj;
import defpackage.fgwg;
import defpackage.fgwj;
import defpackage.fvui;
import defpackage.fvwh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IbBuyFlowInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlif();
    public Bundle a;
    public ejyf b;
    public byte[] c;
    public byte[] d;
    public final fgrc e;

    private IbBuyFlowInput(ejyg ejygVar, fgrc fgrcVar, byte[] bArr, byte[] bArr2) {
        fgrc fgrcVar2 = (fgrc) ejygVar.iQ(5, null);
        fgrcVar2.X(ejygVar);
        ejyf ejyfVar = (ejyf) fgrcVar2;
        this.b = ejyfVar;
        this.c = bArr;
        this.d = bArr2;
        if ((((ejyg) ejyfVar.b).c & 32) == 0) {
            ejyq ejyqVar = ejyq.a;
            if (!ejyfVar.b.L()) {
                ejyfVar.U();
            }
            ejyg ejygVar2 = (ejyg) ejyfVar.b;
            ejyqVar.getClass();
            ejygVar2.j = ejyqVar;
            ejygVar2.c |= 32;
        }
        this.e = fgrcVar;
        if ((((fdgb) fgrcVar.b).b & 1024) != 0) {
            return;
        }
        ekjn ekjnVar = (ekjn) ekjs.a.v();
        if (!ekjnVar.b.L()) {
            ekjnVar.U();
        }
        ekjs ekjsVar = (ekjs) ekjnVar.b;
        ekjsVar.b |= 1;
        ekjsVar.c = false;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar = (fdgb) fgrcVar.b;
        ekjs ekjsVar2 = (ekjs) ekjnVar.Q();
        ekjsVar2.getClass();
        fdgbVar.m = ekjsVar2;
        fdgbVar.b |= 1024;
    }

    public static ekei[] Q(boolean z, boolean z2, List list, int i) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(ekei.CARD_CLASS_PREPAID);
        }
        if (!z2) {
            arrayList.add(ekei.CARD_CLASS_DEBIT);
        }
        if (i == 3) {
            arrayList.add(ekei.CARD_NETWORK_TOKEN_DISABLED);
        }
        if (list == null || list.isEmpty()) {
            list = dlcj.a;
        }
        for (Map.Entry entry : dljb.b.entrySet()) {
            if (!list.contains(entry.getKey())) {
                arrayList.add(ekei.b(((Integer) entry.getValue()).intValue()));
            }
        }
        return (ekei[]) arrayList.toArray(new ekei[arrayList.size()]);
    }

    public static final fddf R(JSONObject jSONObject, dljc dljcVar) {
        String ao;
        fdcy fdcyVar = (fdcy) fddf.a.v();
        dljb o = dljb.o();
        ArrayList arrayList = null;
        if (jSONObject != null && dljb.e(jSONObject, dljcVar) >= 2) {
            ArrayList arrayList2 = new ArrayList();
            JSONObject jSONObject2 = (JSONObject) dljb.aj(jSONObject, "transactionInfo", JSONObject.class, 1074, dljcVar);
            String str = (String) dljb.aj(jSONObject2, "totalPriceStatus", String.class, 1090, dljcVar);
            if (jSONObject2 != null && str != null && ((str.equals("ESTIMATED") || str.equals("FINAL")) && (ao = dljb.ao(jSONObject2, "transactionInfo", dljcVar)) != null)) {
                String str2 = (String) dljb.ak(jSONObject2, "totalPrice", null, String.class, 1089, dljcVar);
                o.k(str2, "transactionInfo.totalPrice", dljcVar);
                if (dljcVar.a.isEmpty()) {
                    fgrc v = fddb.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    fddb fddbVar = (fddb) fgriVar;
                    fddbVar.b |= 4;
                    fddbVar.e = ao;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    fgri fgriVar2 = v.b;
                    fddb fddbVar2 = (fddb) fgriVar2;
                    str2.getClass();
                    fddbVar2.b = 2 | fddbVar2.b;
                    fddbVar2.d = str2;
                    if (!fgriVar2.L()) {
                        v.U();
                    }
                    fddb fddbVar3 = (fddb) v.b;
                    fddbVar3.f = 5;
                    fddbVar3.b |= 8;
                    arrayList2.add((fddb) v.Q());
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList != null) {
            fdcyVar.a(arrayList);
        }
        return (fddf) fdcyVar.Q();
    }

    public static IbBuyFlowInput c(fgpr fgprVar) {
        return d(fgprVar.M());
    }

    public static IbBuyFlowInput d(byte[] bArr) {
        fgwg fgwgVar = (fgwg) ehqn.c(bArr, (fgtg) fgwg.a.iQ(7, null));
        ejyg ejygVar = fgwgVar.d;
        if (ejygVar == null) {
            ejygVar = ejyg.b;
        }
        fdgb fdgbVar = fgwgVar.c;
        if (fdgbVar == null) {
            fdgbVar = fdgb.a;
        }
        fgrc fgrcVar = (fgrc) fdgbVar.iQ(5, null);
        fgrcVar.X(fdgbVar);
        return new IbBuyFlowInput(ejygVar, fgrcVar, fgwgVar.e.M(), fgwgVar.f.M());
    }

    public static IbBuyFlowInput e() {
        fgrc v = fdgb.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        fdgb fdgbVar = (fdgb) fgriVar;
        fdgbVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        fdgbVar.p = true;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        fdgb fdgbVar2 = (fdgb) fgriVar2;
        fdgbVar2.b |= 32;
        fdgbVar2.h = false;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        fdgb fdgbVar3 = (fdgb) fgriVar3;
        fdgbVar3.b |= 128;
        fdgbVar3.j = false;
        if (!fgriVar3.L()) {
            v.U();
        }
        fgri fgriVar4 = v.b;
        fdgb fdgbVar4 = (fdgb) fgriVar4;
        fdgbVar4.b |= 16;
        fdgbVar4.g = false;
        if (!fgriVar4.L()) {
            v.U();
        }
        fgri fgriVar5 = v.b;
        fdgb fdgbVar5 = (fdgb) fgriVar5;
        fdgbVar5.b |= 2048;
        fdgbVar5.n = false;
        if (!fgriVar5.L()) {
            v.U();
        }
        fdgb fdgbVar6 = (fdgb) v.b;
        fdgbVar6.b |= 64;
        fdgbVar6.i = false;
        return new IbBuyFlowInput(ejyg.b, v, null, null);
    }

    public static ejzb g(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
        if (paymentMethodTokenizationParameters == null) {
            return null;
        }
        fgrc v = ejzb.a.v();
        int i = paymentMethodTokenizationParameters.a;
        if (i == 1) {
            if (!v.b.L()) {
                v.U();
            }
            ejzb ejzbVar = (ejzb) v.b;
            ejzbVar.c = 1;
            ejzbVar.b |= 1;
        } else if (i == 2) {
            if (!v.b.L()) {
                v.U();
            }
            ejzb ejzbVar2 = (ejzb) v.b;
            ejzbVar2.c = 2;
            ejzbVar2.b |= 1;
        } else if (i != 3) {
            if (!v.b.L()) {
                v.U();
            }
            ejzb ejzbVar3 = (ejzb) v.b;
            ejzbVar3.c = 0;
            ejzbVar3.b |= 1;
        } else {
            if (!v.b.L()) {
                v.U();
            }
            ejzb ejzbVar4 = (ejzb) v.b;
            ejzbVar4.c = 3;
            ejzbVar4.b |= 1;
        }
        Bundle a = paymentMethodTokenizationParameters.a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(a.keySet());
        Collections.sort(arrayList);
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            fgrc v2 = ejyy.a.v();
            String a2 = dkzn.a(str);
            if (!v2.b.L()) {
                v2.U();
            }
            ejyy ejyyVar = (ejyy) v2.b;
            ejyyVar.b |= 1;
            ejyyVar.c = a2;
            String a3 = dkzn.a(a.getString(str));
            if (!v2.b.L()) {
                v2.U();
            }
            ejyy ejyyVar2 = (ejyy) v2.b;
            ejyyVar2.b |= 2;
            ejyyVar2.d = a3;
            ejyy ejyyVar3 = (ejyy) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            ejzb ejzbVar5 = (ejzb) v.b;
            ejyyVar3.getClass();
            fgsa fgsaVar = ejzbVar5.d;
            if (!fgsaVar.c()) {
                ejzbVar5.d = fgri.E(fgsaVar);
            }
            ejzbVar5.d.add(ejyyVar3);
        }
        return (ejzb) v.Q();
    }

    public static fdct h(List list) {
        if (list == null) {
            return null;
        }
        fgrc v = fdct.a.v();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fgrc v2 = fdcs.a.v();
            String str = (String) list.get(i);
            if (str != null) {
                if (!v2.b.L()) {
                    v2.U();
                }
                fdcs fdcsVar = (fdcs) v2.b;
                fdcsVar.b |= 1;
                fdcsVar.c = str;
            }
            if (!v.b.L()) {
                v.U();
            }
            fdct fdctVar = (fdct) v.b;
            fdcs fdcsVar2 = (fdcs) v2.Q();
            fdcsVar2.getClass();
            fdctVar.b();
            fdctVar.b.add(fdcsVar2);
        }
        return (fdct) v.Q();
    }

    public static fdct i(JSONObject jSONObject, dljc dljcVar) {
        return dljb.e(jSONObject, dljcVar) == 1 ? dljb.t((JSONArray) dljb.aj((JSONObject) dljb.aj(jSONObject, "shippingAddressRequirements", JSONObject.class, 1097, dljcVar), "allowedCountryCodes", JSONArray.class, 1087, dljcVar)) : dljb.t((JSONArray) dljb.aj((JSONObject) dljb.aj(jSONObject, "shippingAddressParameters", JSONObject.class, 1086, dljcVar), "allowedCountryCodes", JSONArray.class, 1087, dljcVar));
    }

    public final void A(boolean z) {
        ejyf ejyfVar = this.b;
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar = (ejyg) ejyfVar.b;
        fgrs fgrsVar = ejyg.a;
        ejygVar.c |= 8;
        ejygVar.g = z;
    }

    public final void B(boolean z) {
        ejyf ejyfVar = this.b;
        ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
        fgrcVar.X(ejyqVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ejyq ejyqVar2 = (ejyq) fgrcVar.b;
        ejyqVar2.b |= 512;
        ejyqVar2.l = z;
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar = (ejyg) ejyfVar.b;
        ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
        ejyqVar3.getClass();
        ejygVar.j = ejyqVar3;
        ejygVar.c |= 32;
        fgrc fgrcVar2 = this.e;
        fgri fgriVar = fgrcVar2.b;
        if (((fdgb) fgriVar).n) {
            if (!fgriVar.L()) {
                fgrcVar2.U();
            }
            fdgb fdgbVar = (fdgb) fgrcVar2.b;
            fdgbVar.b |= 64;
            fdgbVar.i = false;
            return;
        }
        if (!fgriVar.L()) {
            fgrcVar2.U();
        }
        fdgb fdgbVar2 = (fdgb) fgrcVar2.b;
        fdgbVar2.b |= 64;
        fdgbVar2.i = z;
    }

    public final void C(boolean z) {
        ejyf ejyfVar = this.b;
        ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
        fgrcVar.X(ejyqVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ejyq ejyqVar2 = (ejyq) fgrcVar.b;
        ejyqVar2.b |= 32;
        ejyqVar2.h = z;
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar = (ejyg) ejyfVar.b;
        ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
        ejyqVar3.getClass();
        ejygVar.j = ejyqVar3;
        ejygVar.c |= 32;
    }

    public final void D(Bundle bundle) {
        if (bundle != null) {
            this.a = bundle;
        }
    }

    public final boolean E() {
        return ((fdgb) this.e.b).j;
    }

    public final boolean F() {
        ekjs ekjsVar = ((fdgb) this.e.b).m;
        if (ekjsVar == null) {
            ekjsVar = ekjs.a;
        }
        return !ekjsVar.c;
    }

    public final boolean G() {
        ejyq ejyqVar = ((ejyg) this.b.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        return ejyqVar.h;
    }

    public final byte[] H() {
        byte[] bArr;
        if (!fvwh.g() || (bArr = this.c) == null || bArr.length <= 0) {
            return null;
        }
        return bArr;
    }

    public final byte[] I() {
        if (H() != null || J() != null) {
            return null;
        }
        fgrc v = fdfy.a.v();
        fgrc fgrcVar = this.e;
        if (!v.b.L()) {
            v.U();
        }
        fdfy fdfyVar = (fdfy) v.b;
        fdgb fdgbVar = (fdgb) fgrcVar.Q();
        fdgbVar.getClass();
        fdfyVar.c = fdgbVar;
        fdfyVar.b |= 1;
        fdfy fdfyVar2 = (fdfy) v.Q();
        ejyg ejygVar = (ejyg) this.b.Q();
        fgrc fgrcVar2 = (fgrc) ejygVar.iQ(5, null);
        fgrcVar2.X(ejygVar);
        ejyf ejyfVar = (ejyf) fgrcVar2;
        fgpr nD = fdfyVar2.nD();
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar2 = (ejyg) ejyfVar.b;
        fgrs fgrsVar = ejyg.a;
        ejygVar2.c |= 2;
        ejygVar2.e = nD;
        return ((ejyg) ejyfVar.Q()).r();
    }

    public final byte[] J() {
        byte[] bArr;
        if (H() == null && fvwh.a.lK().y() && (bArr = this.d) != null && bArr.length > 0) {
            return bArr;
        }
        return null;
    }

    public final byte[] K() {
        fgrc v = fgwg.a.v();
        ejyf ejyfVar = this.b;
        if (!v.b.L()) {
            v.U();
        }
        fgwg fgwgVar = (fgwg) v.b;
        ejyg ejygVar = (ejyg) ejyfVar.Q();
        ejygVar.getClass();
        fgwgVar.d = ejygVar;
        fgwgVar.b |= 2;
        fgrc fgrcVar = this.e;
        if (!v.b.L()) {
            v.U();
        }
        fgwg fgwgVar2 = (fgwg) v.b;
        fdgb fdgbVar = (fdgb) fgrcVar.Q();
        fdgbVar.getClass();
        fgwgVar2.c = fdgbVar;
        fgwgVar2.b |= 1;
        byte[] bArr = this.c;
        if (bArr == null || bArr.length <= 0) {
            byte[] bArr2 = this.d;
            if (bArr2 != null && bArr2.length > 0) {
                fgpr w = fgpr.w(bArr2);
                if (!v.b.L()) {
                    v.U();
                }
                fgwg fgwgVar3 = (fgwg) v.b;
                fgwgVar3.b |= 8;
                fgwgVar3.f = w;
            }
        } else {
            fgpr w2 = fgpr.w(bArr);
            if (!v.b.L()) {
                v.U();
            }
            fgwg fgwgVar4 = (fgwg) v.b;
            fgwgVar4.b |= 4;
            fgwgVar4.e = w2;
        }
        return ((fgwg) v.Q()).r();
    }

    public final void L() {
        fgrc fgrcVar = this.e;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar = (fdgb) fgrcVar.b;
        fdgb fdgbVar2 = fdgb.a;
        fdgbVar.b |= 4096;
        fdgbVar.o = true;
    }

    public final void M() {
        fgrc fgrcVar = this.e;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar = (fdgb) fgrcVar.b;
        fdgb fdgbVar2 = fdgb.a;
        fdgbVar.b |= 2048;
        fdgbVar.n = true;
        P(N());
        ejyq ejyqVar = ((ejyg) this.b.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        t(ejyqVar.k);
        ejyq ejyqVar2 = ((ejyg) this.b.b).j;
        if (ejyqVar2 == null) {
            ejyqVar2 = ejyq.a;
        }
        B(ejyqVar2.l);
    }

    public final int N() {
        ejyq ejyqVar = ((ejyg) this.b.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        int a = ejyi.a(ejyqVar.j);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int O() {
        ejyq ejyqVar = ((ejyg) this.b.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        if ((ejyqVar.b & 8) == 0) {
            return 1;
        }
        ejyq ejyqVar2 = ((ejyg) this.b.b).j;
        if (ejyqVar2 == null) {
            ejyqVar2 = ejyq.a;
        }
        ejzb ejzbVar = ejyqVar2.f;
        if (ejzbVar == null) {
            ejzbVar = ejzb.a;
        }
        int a = ejza.a(ejzbVar.c);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final void P(int i) {
        ejyf ejyfVar = this.b;
        ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
        fgrcVar.X(ejyqVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ejyq ejyqVar2 = (ejyq) fgrcVar.b;
        int i2 = i - 1;
        ejyqVar2.j = i2;
        ejyqVar2.b |= 128;
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar = (ejyg) ejyfVar.b;
        ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
        ejyqVar3.getClass();
        ejygVar.j = ejyqVar3;
        ejygVar.c |= 32;
        fgrc fgrcVar2 = this.e;
        fgri fgriVar = fgrcVar2.b;
        if (((fdgb) fgriVar).n) {
            if (!fgriVar.L()) {
                fgrcVar2.U();
            }
            fdgb fdgbVar = (fdgb) fgrcVar2.b;
            fdgbVar.f = 0;
            fdgbVar.b |= 8;
            return;
        }
        if (!fgriVar.L()) {
            fgrcVar2.U();
        }
        fdgb fdgbVar2 = (fdgb) fgrcVar2.b;
        fdgbVar2.f = i2;
        fdgbVar2.b |= 8;
    }

    public final int a(String str) {
        ekjs ekjsVar = ((fdgb) this.e.b).m;
        if (ekjsVar == null) {
            ekjsVar = ekjs.a;
        }
        while (true) {
            int i = 1;
            for (ekjr ekjrVar : ekjsVar.d) {
                if (!str.equals(ekjrVar.c) || (i = ekjp.a(ekjrVar.d)) != 0) {
                }
            }
            return ehqa.b(i);
        }
    }

    public final IbBuyFlowInput b() {
        ejyg ejygVar = (ejyg) this.b.Q();
        fdgb fdgbVar = (fdgb) this.e.Q();
        fgrc fgrcVar = (fgrc) fdgbVar.iQ(5, null);
        fgrcVar.X(fdgbVar);
        IbBuyFlowInput ibBuyFlowInput = new IbBuyFlowInput(ejygVar, fgrcVar, this.c, this.d);
        ibBuyFlowInput.D(this.a);
        return ibBuyFlowInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ejyf f(JSONObject jSONObject, String str, dljc dljcVar) {
        fdct i = i(jSONObject, dljcVar);
        if (i != null) {
            ejyf ejyfVar = this.b;
            if (!ejyfVar.b.L()) {
                ejyfVar.U();
            }
            ejyg ejygVar = (ejyg) ejyfVar.b;
            fgrs fgrsVar = ejyg.a;
            ejygVar.h = i;
            ejygVar.c |= 16;
        } else {
            ejyf ejyfVar2 = this.b;
            if (!ejyfVar2.b.L()) {
                ejyfVar2.U();
            }
            ejyg ejygVar2 = (ejyg) ejyfVar2.b;
            fgrs fgrsVar2 = ejyg.a;
            ejygVar2.h = null;
            ejygVar2.c &= -17;
        }
        ejyf ejyfVar3 = this.b;
        ejyq ejyqVar = ((ejyg) ejyfVar3.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
        fgrcVar.X(ejyqVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ejyq ejyqVar2 = (ejyq) fgrcVar.b;
        str.getClass();
        ejyqVar2.b |= 2048;
        ejyqVar2.o = str;
        if (!ejyfVar3.b.L()) {
            ejyfVar3.U();
        }
        ejyg ejygVar3 = (ejyg) ejyfVar3.b;
        ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
        ejyqVar3.getClass();
        ejygVar3.j = ejyqVar3;
        ejygVar3.c |= 32;
        if (fvui.c()) {
            ejyf ejyfVar4 = this.b;
            fddf R = R(jSONObject, dljcVar);
            if (!ejyfVar4.b.L()) {
                ejyfVar4.U();
            }
            ejyg ejygVar4 = (ejyg) ejyfVar4.b;
            R.getClass();
            ejygVar4.l = R;
            ejygVar4.c |= 128;
        }
        return this.b;
    }

    public final fdec j() {
        ejyq ejyqVar = ((ejyg) this.b.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        if ((ejyqVar.b & 16) == 0) {
            return null;
        }
        ejyq ejyqVar2 = ((ejyg) this.b.b).j;
        if (ejyqVar2 == null) {
            ejyqVar2 = ejyq.a;
        }
        fdec fdecVar = ejyqVar2.g;
        return fdecVar == null ? fdec.a : fdecVar;
    }

    public final fdfy k() {
        fgrc v = fdfy.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgrc fgrcVar = this.e;
        fdfy fdfyVar = (fdfy) v.b;
        fdgb fdgbVar = (fdgb) fgrcVar.Q();
        fdgbVar.getClass();
        fdfyVar.c = fdgbVar;
        fdfyVar.b |= 1;
        return (fdfy) v.Q();
    }

    public final String l() {
        int N = N() - 1;
        return N != 3 ? N != 4 ? N != 5 ? N != 6 ? "loadMaskedWallet" : "loadPaymentData" : "loadWebPaymentData" : "loadFullWallet" : "changeMaskedWallet";
    }

    public final String m() {
        ejyq ejyqVar = ((ejyg) this.b.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        return ejyqVar.c;
    }

    public final String n() {
        return ((fdgb) this.e.b).d;
    }

    public final String o() {
        return ((fdgb) this.e.b).k;
    }

    public final String p(String str) {
        ejyq ejyqVar = ((ejyg) this.b.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        if ((ejyqVar.b & 8) == 0) {
            return null;
        }
        ejzb ejzbVar = ejyqVar.f;
        if (ejzbVar == null) {
            ejzbVar = ejzb.a;
        }
        for (ejyy ejyyVar : ejzbVar.d) {
            if (str.equals(ejyyVar.c)) {
                return ejyyVar.d;
            }
        }
        return null;
    }

    public final void q(GetActiveCardsForAccountResponse getActiveCardsForAccountResponse) {
        if (getActiveCardsForAccountResponse == null) {
            fgrc fgrcVar = this.e;
            ekjs ekjsVar = ((fdgb) fgrcVar.b).m;
            if (ekjsVar == null) {
                ekjsVar = ekjs.a;
            }
            fgrc fgrcVar2 = (fgrc) ekjsVar.iQ(5, null);
            fgrcVar2.X(ekjsVar);
            ekjn ekjnVar = (ekjn) fgrcVar2;
            if (!ekjnVar.b.L()) {
                ekjnVar.U();
            }
            ((ekjs) ekjnVar.b).d = fgtj.a;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            fdgb fdgbVar = (fdgb) fgrcVar.b;
            ekjs ekjsVar2 = (ekjs) ekjnVar.Q();
            ekjsVar2.getClass();
            fdgbVar.m = ekjsVar2;
            fdgbVar.b |= 1024;
            return;
        }
        fgrc fgrcVar3 = this.e;
        ekjs ekjsVar3 = ((fdgb) fgrcVar3.b).m;
        if (ekjsVar3 == null) {
            ekjsVar3 = ekjs.a;
        }
        fgrc fgrcVar4 = (fgrc) ekjsVar3.iQ(5, null);
        fgrcVar4.X(ekjsVar3);
        ekjn ekjnVar2 = (ekjn) fgrcVar4;
        if (!ekjnVar2.b.L()) {
            ekjnVar2.U();
        }
        ((ekjs) ekjnVar2.b).d = fgtj.a;
        ekjnVar2.a(dljb.E(getActiveCardsForAccountResponse.a));
        if (!fgrcVar3.b.L()) {
            fgrcVar3.U();
        }
        fdgb fdgbVar2 = (fdgb) fgrcVar3.b;
        ekjs ekjsVar4 = (ekjs) ekjnVar2.Q();
        ekjsVar4.getClass();
        fdgbVar2.m = ekjsVar4;
        fdgbVar2.b |= 1024;
    }

    public final void r(fgwj fgwjVar) {
        fgrc fgrcVar = this.e;
        String str = fgwjVar.d;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar = (fdgb) fgrcVar.b;
        fdgb fdgbVar2 = fdgb.a;
        str.getClass();
        fdgbVar.b |= 256;
        fdgbVar.k = str;
        fgpr fgprVar = fgwjVar.e;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fgri fgriVar = fgrcVar.b;
        fdgb fdgbVar3 = (fdgb) fgriVar;
        fgprVar.getClass();
        fdgbVar3.b |= 512;
        fdgbVar3.l = fgprVar;
        boolean z = fgwjVar.f;
        if (!fgriVar.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar4 = (fdgb) fgrcVar.b;
        fdgbVar4.b |= 128;
        fdgbVar4.j = z;
    }

    public final void s(fdga fdgaVar) {
        fgrc fgrcVar = this.e;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar = (fdgb) fgrcVar.b;
        fdgb fdgbVar2 = fdgb.a;
        fdgaVar.getClass();
        fdgbVar.c = fdgaVar;
        fdgbVar.b |= 1;
    }

    public final void t(boolean z) {
        ejyf ejyfVar = this.b;
        ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
        fgrcVar.X(ejyqVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ejyq ejyqVar2 = (ejyq) fgrcVar.b;
        ejyqVar2.b |= 256;
        ejyqVar2.k = z;
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar = (ejyg) ejyfVar.b;
        ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
        ejyqVar3.getClass();
        ejygVar.j = ejyqVar3;
        ejygVar.c |= 32;
        fgrc fgrcVar2 = this.e;
        fgri fgriVar = fgrcVar2.b;
        if (((fdgb) fgriVar).n) {
            if (!fgriVar.L()) {
                fgrcVar2.U();
            }
            fdgb fdgbVar = (fdgb) fgrcVar2.b;
            fdgbVar.b |= 32;
            fdgbVar.h = false;
            return;
        }
        if (!fgriVar.L()) {
            fgrcVar2.U();
        }
        fdgb fdgbVar2 = (fdgb) fgrcVar2.b;
        fdgbVar2.b |= 32;
        fdgbVar2.h = z;
    }

    public final void u(String str) {
        ejyf ejyfVar = this.b;
        ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
        fgrcVar.X(ejyqVar);
        atzb.s(str);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ejyq ejyqVar2 = (ejyq) fgrcVar.b;
        ejyqVar2.b |= 1;
        ejyqVar2.c = str;
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar = (ejyg) ejyfVar.b;
        ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
        ejyqVar3.getClass();
        ejygVar.j = ejyqVar3;
        ejygVar.c |= 32;
    }

    public final void v(boolean z) {
        fgrc fgrcVar = this.e;
        ekjs ekjsVar = ((fdgb) fgrcVar.b).m;
        if (ekjsVar == null) {
            ekjsVar = ekjs.a;
        }
        fgrc fgrcVar2 = (fgrc) ekjsVar.iQ(5, null);
        fgrcVar2.X(ekjsVar);
        ekjn ekjnVar = (ekjn) fgrcVar2;
        boolean z2 = !z;
        if (!ekjnVar.b.L()) {
            ekjnVar.U();
        }
        ekjs ekjsVar2 = (ekjs) ekjnVar.b;
        ekjsVar2.b |= 1;
        ekjsVar2.c = z2;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar = (fdgb) fgrcVar.b;
        ekjs ekjsVar3 = (ekjs) ekjnVar.Q();
        ekjsVar3.getClass();
        fdgbVar.m = ekjsVar3;
        fdgbVar.b |= 1024;
    }

    public final void w(boolean z) {
        fgrc fgrcVar = this.e;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fdgb fdgbVar = (fdgb) fgrcVar.b;
        fdgb fdgbVar2 = fdgb.a;
        fdgbVar.b |= 16;
        fdgbVar.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(K());
        parcel.writeBundle(this.a);
    }

    public final void x(fdec fdecVar) {
        if (fdecVar != null) {
            ejyf ejyfVar = this.b;
            ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
            if (ejyqVar == null) {
                ejyqVar = ejyq.a;
            }
            fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
            fgrcVar.X(ejyqVar);
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            ejyq ejyqVar2 = (ejyq) fgrcVar.b;
            ejyqVar2.g = fdecVar;
            ejyqVar2.b |= 16;
            if (!ejyfVar.b.L()) {
                ejyfVar.U();
            }
            ejyg ejygVar = (ejyg) ejyfVar.b;
            ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
            ejyqVar3.getClass();
            ejygVar.j = ejyqVar3;
            ejygVar.c |= 32;
        }
    }

    public final void y(int i) {
        ejyf ejyfVar = this.b;
        ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
        if (ejyqVar == null) {
            ejyqVar = ejyq.a;
        }
        fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
        fgrcVar.X(ejyqVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ejyq ejyqVar2 = (ejyq) fgrcVar.b;
        ejyqVar2.b |= 64;
        ejyqVar2.i = i;
        if (!ejyfVar.b.L()) {
            ejyfVar.U();
        }
        ejyg ejygVar = (ejyg) ejyfVar.b;
        ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
        ejyqVar3.getClass();
        ejygVar.j = ejyqVar3;
        ejygVar.c |= 32;
    }

    public final void z(PaymentDataRequest paymentDataRequest) {
        ejzb g = g(paymentDataRequest.g);
        if (g != null) {
            ejyf ejyfVar = this.b;
            ejyq ejyqVar = ((ejyg) ejyfVar.b).j;
            if (ejyqVar == null) {
                ejyqVar = ejyq.a;
            }
            fgrc fgrcVar = (fgrc) ejyqVar.iQ(5, null);
            fgrcVar.X(ejyqVar);
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            ejyq ejyqVar2 = (ejyq) fgrcVar.b;
            ejyqVar2.f = g;
            ejyqVar2.b |= 8;
            if (!ejyfVar.b.L()) {
                ejyfVar.U();
            }
            ejyg ejygVar = (ejyg) ejyfVar.b;
            ejyq ejyqVar3 = (ejyq) fgrcVar.Q();
            ejyqVar3.getClass();
            ejygVar.j = ejyqVar3;
            ejygVar.c |= 32;
            return;
        }
        ejyf ejyfVar2 = this.b;
        ejyq ejyqVar4 = ((ejyg) ejyfVar2.b).j;
        if (ejyqVar4 == null) {
            ejyqVar4 = ejyq.a;
        }
        fgrc fgrcVar2 = (fgrc) ejyqVar4.iQ(5, null);
        fgrcVar2.X(ejyqVar4);
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        ejyq ejyqVar5 = (ejyq) fgrcVar2.b;
        ejyqVar5.f = null;
        ejyqVar5.b &= -9;
        if (!ejyfVar2.b.L()) {
            ejyfVar2.U();
        }
        ejyg ejygVar2 = (ejyg) ejyfVar2.b;
        ejyq ejyqVar6 = (ejyq) fgrcVar2.Q();
        ejyqVar6.getClass();
        ejygVar2.j = ejyqVar6;
        ejygVar2.c |= 32;
    }
}
