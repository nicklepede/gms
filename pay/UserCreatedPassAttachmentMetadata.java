package com.google.android.gms.pay;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvoc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class UserCreatedPassAttachmentMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvoc();
    public Uri a;
    public String b;

    private UserCreatedPassAttachmentMetadata() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserCreatedPassAttachmentMetadata) {
            UserCreatedPassAttachmentMetadata userCreatedPassAttachmentMetadata = (UserCreatedPassAttachmentMetadata) obj;
            if (atyq.b(this.a, userCreatedPassAttachmentMetadata.a) && atyq.b(this.b, userCreatedPassAttachmentMetadata.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public UserCreatedPassAttachmentMetadata(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
