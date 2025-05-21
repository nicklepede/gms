package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.bbjf;
import defpackage.bbts;
import defpackage.bbtt;
import defpackage.bbtz;
import defpackage.bbut;
import defpackage.eitj;
import defpackage.eiuu;
import defpackage.eive;
import defpackage.feay;
import defpackage.ffuh;
import defpackage.ffuj;
import defpackage.ffun;
import defpackage.ffuo;
import defpackage.ffup;
import defpackage.ffur;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public final PublicKeyCredentialType a;
    public final feay b;
    public final List c;
    private static final eiuu d = eiuu.K(bbut.a, bbut.b);
    public static final Parcelable.Creator CREATOR = new bbtt();

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        feay w = feay.w(bArr);
        arwm.s(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            this.b = w;
            this.c = list;
        } catch (bbtz e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static PublicKeyCredentialDescriptor a(ffur ffurVar) {
        ArrayList arrayList;
        try {
            arwm.s(ffurVar);
            if (!(ffurVar instanceof ffuo)) {
                throw new bbts("Cannot parse credential descriptor from non-map CBOR input");
            }
            eive eiveVar = ((ffuo) ffurVar).a;
            if (!eiveVar.d.containsAll(d)) {
                throw new bbts("Cannot parse credential descriptor from input that does not have both id and type as labels");
            }
            ffur ffurVar2 = (ffur) eiveVar.get(bbut.a);
            ffur ffurVar3 = (ffur) eiveVar.get(bbut.b);
            if (ffurVar2 == null || ffurVar3 == null) {
                throw new bbts("Cannot parse credential descriptor from input that does not have both id and type as labels");
            }
            if (!(ffurVar2 instanceof ffuj)) {
                throw new bbts("Cannot parse credential descriptor that has a non-bytestring CBOR value for id label");
            }
            byte[] M = ((ffuj) ffurVar2).a.M();
            PublicKeyCredentialType publicKeyCredentialType = PublicKeyCredentialType.a;
            if (!(ffurVar3 instanceof ffup)) {
                throw new bbtz("Cannot parse a credential type from non-textstring CBOR input");
            }
            PublicKeyCredentialType a = PublicKeyCredentialType.a(((ffup) ffurVar3).a);
            ffup ffupVar = bbut.c;
            if (eiveVar.containsKey(ffupVar)) {
                ffur ffurVar4 = (ffur) eiveVar.get(ffupVar);
                Transport transport = Transport.BLUETOOTH_CLASSIC;
                arwm.s(ffurVar4);
                if (!(ffurVar4 instanceof ffuh)) {
                    throw new bbjf("Cannot parse a list of transports from non-array CBOR input");
                }
                arrayList = new ArrayList();
                eitj eitjVar = ((ffuh) ffurVar4).a;
                int size = eitjVar.size();
                for (int i = 0; i < size; i++) {
                    ffur ffurVar5 = (ffur) eitjVar.get(i);
                    arwm.s(ffurVar5);
                    if (!(ffurVar5 instanceof ffup)) {
                        throw new bbjf("Cannot parse a transport from non-textstring CBOR input");
                    }
                    arrayList.add(Transport.a(((ffup) ffurVar5).a));
                }
            } else {
                arrayList = null;
            }
            return new PublicKeyCredentialDescriptor(a.b, M, arrayList);
        } catch (bbjf | bbtz e) {
            throw new bbts(e);
        }
    }

    public static PublicKeyCredentialDescriptor b(JSONObject jSONObject) {
        return new PublicKeyCredentialDescriptor(jSONObject.getString("type"), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.b(jSONObject.getJSONArray("transports")) : null);
    }

    public final ffuo c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ffun(bbut.b, new ffup(this.a.b)));
        arrayList.add(new ffun(bbut.a, ffur.k(this.b.M())));
        List list = this.c;
        if (list != null && !list.isEmpty()) {
            ffup ffupVar = bbut.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ffup(((Transport) it.next()).h));
            }
            arrayList.add(new ffun(ffupVar, ffur.g(arrayList2)));
        }
        return ffur.n(arrayList);
    }

    public final byte[] d() {
        return this.b.M();
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.a.equals(publicKeyCredentialDescriptor.a) || !arwb.b(this.b, publicKeyCredentialDescriptor.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && publicKeyCredentialDescriptor.c == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.c) != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.a) + ", \n id=" + asnj.c(d()) + ", \n transports=" + String.valueOf(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a.b;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.i(parcel, 3, d(), false);
        arxc.y(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
