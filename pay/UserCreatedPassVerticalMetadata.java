package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvod;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class UserCreatedPassVerticalMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvod();
    public BulkImportUcpMetadata a;

    private UserCreatedPassVerticalMetadata() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserCreatedPassVerticalMetadata) {
            return atyq.b(this.a, ((UserCreatedPassVerticalMetadata) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.c(parcel, a);
    }

    public UserCreatedPassVerticalMetadata(BulkImportUcpMetadata bulkImportUcpMetadata) {
        this.a = bulkImportUcpMetadata;
    }
}
