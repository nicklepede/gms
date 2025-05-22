package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adam;
import defpackage.atzr;
import defpackage.atzs;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class D2dOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adam();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Bundle f;

    public D2dOptions(boolean z, boolean z2, boolean z3, boolean z4, int i, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = bundle;
    }

    public static D2dOptions a(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? new D2dOptions() : (D2dOptions) atzs.a(bArr, CREATOR);
    }

    public static D2dOptions b(Bundle bundle) {
        return bundle == null ? new D2dOptions() : a(bundle.getByteArray("d2d_options"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D2dOptions)) {
            return false;
        }
        D2dOptions d2dOptions = (D2dOptions) obj;
        if (this.a == d2dOptions.a && this.b == d2dOptions.b && this.c == d2dOptions.c && this.d == d2dOptions.d && this.e == d2dOptions.e) {
            Bundle bundle = d2dOptions.f;
            Bundle bundle2 = this.f;
            if (bundle2 == null && bundle == null) {
                return true;
            }
            if (bundle2 != null && bundle != null) {
                if (bundle2.keySet() == null && bundle.keySet() == null) {
                    return true;
                }
                if (bundle2.keySet() != null && bundle.keySet() != null && bundle2.keySet().size() == bundle.keySet().size()) {
                    for (String str : bundle2.keySet()) {
                        Object obj2 = bundle2.get(str);
                        Object obj3 = bundle.get(str);
                        if (obj2 != null || obj3 != null) {
                            if (obj2 != null && obj3 != null && obj2.equals(obj3)) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList;
        Bundle bundle = this.f;
        ArrayList arrayList2 = null;
        if (bundle == null || bundle.keySet() != null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(bundle.keySet());
            if (!arrayList3.isEmpty()) {
                arrayList2 = new ArrayList(arrayList3.size());
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    Object obj = bundle.get((String) arrayList3.get(i));
                    if (obj == null) {
                        obj = new Object();
                    }
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
            arrayList2 = arrayList3;
        }
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(this.e), arrayList2, arrayList});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("isWifiD2d=");
        sb.append(this.a);
        sb.append(", isDeferredSuw=");
        sb.append(this.b);
        sb.append(", isQuickStart=");
        sb.append(this.c);
        sb.append(", isRebootAfterPaired=");
        sb.append(this.d);
        sb.append(", sessionId=");
        sb.append(this.e);
        Bundle bundle = this.f;
        sb.append(", ssBundle=".concat(bundle == null ? "null" : "notNull, "));
        if (bundle != null) {
            sb.append("isShardSecretPresent=" + bundle.containsKey("shared_secret"));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.g(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }

    public D2dOptions() {
        this(false, false, false, false, -1, null);
    }
}
