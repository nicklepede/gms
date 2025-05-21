package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bcqv;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new bcqv();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;
    public final Set h;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = list;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                arwm.c((registeredKey.b == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                String str2 = registeredKey.c;
                arwm.c(true, "register request has null challenge and no default challenge isprovided");
                String str3 = registeredKey.b;
                if (str3 != null) {
                    hashSet.add(Uri.parse(str3));
                }
            }
        }
        this.h = hashSet;
        arwm.c(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final ChannelIdValue b() {
        return this.f;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Double c() {
        return this.b;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Integer d() {
        return this.a;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Set e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (arwb.b(this.a, signRequestParams.a) && arwb.b(this.b, signRequestParams.b) && arwb.b(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list = this.e;
            List list2 = signRequestParams.e;
            if (list.containsAll(list2) && list2.containsAll(list) && arwb.b(this.f, signRequestParams.f) && arwb.b(this.g, signRequestParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = arxc.a(parcel);
        arxc.F(parcel, 2, num);
        arxc.B(parcel, 3, this.b);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.i(parcel, 5, this.d, false);
        arxc.y(parcel, 6, this.e, false);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.c(parcel, a);
    }
}
