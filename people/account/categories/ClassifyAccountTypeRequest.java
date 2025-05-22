package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cvtf;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ClassifyAccountTypeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvtf();
    public final String a;
    public final String b;
    public final int c;

    public ClassifyAccountTypeRequest(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeRequest classifyAccountTypeRequest = (ClassifyAccountTypeRequest) obj;
            if (ekus.a(this.a, classifyAccountTypeRequest.a) && ekus.a(this.b, classifyAccountTypeRequest.b) && this.c == classifyAccountTypeRequest.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public ClassifyAccountTypeRequest(String str, String str2) {
        this(str, str2, 2);
    }
}
