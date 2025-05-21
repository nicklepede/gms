package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bcqs;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new bcqs();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;
    public Set h;

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        arwm.c((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.d = list;
        this.e = list2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            arwm.c((uri == null && registerRequest.d == null) ? false : true, "register request has null appId and no request appId is provided");
            String str2 = registerRequest.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            arwm.c((uri == null && registeredKey.b == null) ? false : true, "registered key has null appId and no request appId is provided");
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
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
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return arwb.b(this.a, registerRequestParams.a) && arwb.b(this.b, registerRequestParams.b) && arwb.b(this.c, registerRequestParams.c) && arwb.b(this.d, registerRequestParams.d) && (((list = this.e) == null && registerRequestParams.e == null) || (list != null && (list2 = registerRequestParams.e) != null && list.containsAll(list2) && list2.containsAll(list))) && arwb.b(this.f, registerRequestParams.f) && arwb.b(this.g, registerRequestParams.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = arxc.a(parcel);
        arxc.F(parcel, 2, num);
        arxc.B(parcel, 3, this.b);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.y(parcel, 5, this.d, false);
        arxc.y(parcel, 6, this.e, false);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.c(parcel, a);
    }
}
