package com.google.android.gms.pay;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctex;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UserCreatedPassAttachmentMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctex();
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
            if (arwb.b(this.a, userCreatedPassAttachmentMetadata.a) && arwb.b(this.b, userCreatedPassAttachmentMetadata.b)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public UserCreatedPassAttachmentMetadata(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
