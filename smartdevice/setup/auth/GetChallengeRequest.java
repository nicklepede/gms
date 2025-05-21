package com.google.android.gms.smartdevice.setup.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.deff;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deff();
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
            if (arwb.b(this.a, getChallengeRequest.a) && arwb.b(this.b, getChallengeRequest.b) && arwb.b(this.c, getChallengeRequest.c)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }

    public GetChallengeRequest(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
