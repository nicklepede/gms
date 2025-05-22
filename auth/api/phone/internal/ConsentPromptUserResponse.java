package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abjk;
import defpackage.atyq;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ConsentPromptUserResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abjk();
    public int a;
    public String b;
    public String c;

    public ConsentPromptUserResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentPromptUserResponse) {
            ConsentPromptUserResponse consentPromptUserResponse = (ConsentPromptUserResponse) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(consentPromptUserResponse.a)) && atyq.b(this.b, consentPromptUserResponse.b) && atyq.b(this.c, consentPromptUserResponse.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public ConsentPromptUserResponse(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
