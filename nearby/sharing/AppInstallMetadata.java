package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cntq;
import defpackage.ekxk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AppInstallMetadata extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cntq();
    public final int a;
    public final boolean b;

    public AppInstallMetadata(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AppInstallMetadata clone() {
        try {
            return (AppInstallMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new ekxk(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppInstallMetadata) {
            AppInstallMetadata appInstallMetadata = (AppInstallMetadata) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(appInstallMetadata.a)) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(appInstallMetadata.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        int i = this.a;
        return String.format(locale, "AppInstallMetadata<status: %s, isFinalStatus: %s>", i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "INSTALLING" : "INSTALLED" : "FAILED", Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
