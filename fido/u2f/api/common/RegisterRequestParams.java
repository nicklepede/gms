package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.besf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new besf();
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
        atzb.c((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
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
            atzb.c((uri == null && registerRequest.d == null) ? false : true, "register request has null appId and no request appId is provided");
            String str2 = registerRequest.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            atzb.c((uri == null && registeredKey.b == null) ? false : true, "registered key has null appId and no request appId is provided");
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        this.h = hashSet;
        atzb.c(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
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
        return atyq.b(this.a, registerRequestParams.a) && atyq.b(this.b, registerRequestParams.b) && atyq.b(this.c, registerRequestParams.c) && atyq.b(this.d, registerRequestParams.d) && (((list = this.e) == null && registerRequestParams.e == null) || (list != null && (list2 = registerRequestParams.e) != null && list.containsAll(list2) && list2.containsAll(list))) && atyq.b(this.f, registerRequestParams.f) && atyq.b(this.g, registerRequestParams.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = atzr.a(parcel);
        atzr.F(parcel, 2, num);
        atzr.B(parcel, 3, this.b);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.y(parcel, 5, this.d, false);
        atzr.y(parcel, 6, this.e, false);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.c(parcel, a);
    }
}
