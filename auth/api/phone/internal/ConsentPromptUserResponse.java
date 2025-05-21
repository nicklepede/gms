package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.zjk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ConsentPromptUserResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zjk();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(consentPromptUserResponse.a)) && arwb.b(this.b, consentPromptUserResponse.b) && arwb.b(this.c, consentPromptUserResponse.c)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public ConsentPromptUserResponse(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
