package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avvs;
import defpackage.avvt;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avvs();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avvt();
        public final String[] a;
        public final String[] b;
        public final String[] c;

        public Inclusion(String[] strArr, String[] strArr2, String[] strArr3) {
            this.a = strArr;
            this.b = strArr2;
            this.c = strArr3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return Arrays.equals(this.a, inclusion.a) && Arrays.equals(this.b, inclusion.b) && Arrays.equals(this.c, inclusion.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.a) + Arrays.hashCode(this.b) + Arrays.hashCode(this.c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String[] strArr = this.a;
            int a = atzr.a(parcel);
            atzr.w(parcel, 2, strArr, false);
            atzr.w(parcel, 3, this.b, false);
            atzr.w(parcel, 4, this.c, false);
            atzr.c(parcel, a);
        }
    }

    public KeyFilterImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static boolean a(String str, String[] strArr) {
        if (strArr == null || (strArr.length) == 0) {
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyFilterImpl) {
            return this.a.equals(((KeyFilterImpl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 2, arrayList, false);
        atzr.c(parcel, a);
    }
}
