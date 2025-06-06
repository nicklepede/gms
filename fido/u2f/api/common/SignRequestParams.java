package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.besi;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new besi();
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
                atzb.c((registeredKey.b == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                String str2 = registeredKey.c;
                atzb.c(true, "register request has null challenge and no default challenge isprovided");
                String str3 = registeredKey.b;
                if (str3 != null) {
                    hashSet.add(Uri.parse(str3));
                }
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (atyq.b(this.a, signRequestParams.a) && atyq.b(this.b, signRequestParams.b) && atyq.b(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list = this.e;
            List list2 = signRequestParams.e;
            if (list.containsAll(list2) && list2.containsAll(list) && atyq.b(this.f, signRequestParams.f) && atyq.b(this.g, signRequestParams.g)) {
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
        int a = atzr.a(parcel);
        atzr.F(parcel, 2, num);
        atzr.B(parcel, 3, this.b);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.i(parcel, 5, this.d, false);
        atzr.y(parcel, 6, this.e, false);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.c(parcel, a);
    }
}
