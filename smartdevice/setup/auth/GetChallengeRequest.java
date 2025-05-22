package com.google.android.gms.smartdevice.setup.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dgqi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgqi();
    public String a;
    public String b;
    public String c;

    public GetChallengeRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetChallengeRequest) {
            GetChallengeRequest getChallengeRequest = (GetChallengeRequest) obj;
            if (atyq.b(this.a, getChallengeRequest.a) && atyq.b(this.b, getChallengeRequest.b) && atyq.b(this.c, getChallengeRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }

    public GetChallengeRequest(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
