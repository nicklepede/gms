package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurd;
import defpackage.bdnc;
import defpackage.bdxj;
import defpackage.bdxk;
import defpackage.bdxq;
import defpackage.bdyk;
import defpackage.elgo;
import defpackage.elhz;
import defpackage.elij;
import defpackage.fgpr;
import defpackage.fijf;
import defpackage.fijh;
import defpackage.fijl;
import defpackage.fijm;
import defpackage.fijn;
import defpackage.fijp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public final PublicKeyCredentialType a;
    public final fgpr b;
    public final List c;
    private static final elhz d = elhz.K(bdyk.a, bdyk.b);
    public static final Parcelable.Creator CREATOR = new bdxk();

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        fgpr w = fgpr.w(bArr);
        atzb.s(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            this.b = w;
            this.c = list;
        } catch (bdxq e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static PublicKeyCredentialDescriptor a(fijp fijpVar) {
        ArrayList arrayList;
        try {
            atzb.s(fijpVar);
            if (!(fijpVar instanceof fijm)) {
                throw new bdxj("Cannot parse credential descriptor from non-map CBOR input");
            }
            elij elijVar = ((fijm) fijpVar).a;
            if (!elijVar.d.containsAll(d)) {
                throw new bdxj("Cannot parse credential descriptor from input that does not have both id and type as labels");
            }
            fijp fijpVar2 = (fijp) elijVar.get(bdyk.a);
            fijp fijpVar3 = (fijp) elijVar.get(bdyk.b);
            if (fijpVar2 == null || fijpVar3 == null) {
                throw new bdxj("Cannot parse credential descriptor from input that does not have both id and type as labels");
            }
            if (!(fijpVar2 instanceof fijh)) {
                throw new bdxj("Cannot parse credential descriptor that has a non-bytestring CBOR value for id label");
            }
            byte[] M = ((fijh) fijpVar2).a.M();
            PublicKeyCredentialType publicKeyCredentialType = PublicKeyCredentialType.a;
            if (!(fijpVar3 instanceof fijn)) {
                throw new bdxq("Cannot parse a credential type from non-textstring CBOR input");
            }
            PublicKeyCredentialType a = PublicKeyCredentialType.a(((fijn) fijpVar3).a);
            fijn fijnVar = bdyk.c;
            if (elijVar.containsKey(fijnVar)) {
                fijp fijpVar4 = (fijp) elijVar.get(fijnVar);
                Transport transport = Transport.BLUETOOTH_CLASSIC;
                atzb.s(fijpVar4);
                if (!(fijpVar4 instanceof fijf)) {
                    throw new bdnc("Cannot parse a list of transports from non-array CBOR input");
                }
                arrayList = new ArrayList();
                elgo elgoVar = ((fijf) fijpVar4).a;
                int size = elgoVar.size();
                for (int i = 0; i < size; i++) {
                    fijp fijpVar5 = (fijp) elgoVar.get(i);
                    atzb.s(fijpVar5);
                    if (!(fijpVar5 instanceof fijn)) {
                        throw new bdnc("Cannot parse a transport from non-textstring CBOR input");
                    }
                    arrayList.add(Transport.a(((fijn) fijpVar5).a));
                }
            } else {
                arrayList = null;
            }
            return new PublicKeyCredentialDescriptor(a.b, M, arrayList);
        } catch (bdnc | bdxq e) {
            throw new bdxj(e);
        }
    }

    public static PublicKeyCredentialDescriptor b(JSONObject jSONObject) {
        return new PublicKeyCredentialDescriptor(jSONObject.getString("type"), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.b(jSONObject.getJSONArray("transports")) : null);
    }

    public final fijm c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fijl(bdyk.b, new fijn(this.a.b)));
        arrayList.add(new fijl(bdyk.a, fijp.k(this.b.M())));
        List list = this.c;
        if (list != null && !list.isEmpty()) {
            fijn fijnVar = bdyk.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new fijn(((Transport) it.next()).h));
            }
            arrayList.add(new fijl(fijnVar, fijp.g(arrayList2)));
        }
        return fijp.n(arrayList);
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
        if (!this.a.equals(publicKeyCredentialDescriptor.a) || !atyq.b(this.b, publicKeyCredentialDescriptor.b)) {
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
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.a) + ", \n id=" + aurd.c(d()) + ", \n transports=" + String.valueOf(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a.b;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.i(parcel, 3, d(), false);
        atzr.y(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }
}
