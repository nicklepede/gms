package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adaj;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ApplicationInformation extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adaj();
    final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public ApplicationInformation(int i, String str, String str2, boolean z, boolean z2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApplicationInformation)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ApplicationInformation applicationInformation = (ApplicationInformation) obj;
        return TextUtils.equals(this.b, applicationInformation.b) && TextUtils.equals(this.c, applicationInformation.c) && TextUtils.equals(this.f, applicationInformation.f) && this.d == applicationInformation.d && this.e == applicationInformation.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }

    public ApplicationInformation(String str, String str2, boolean z, boolean z2, String str3) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = str3;
    }
}
