package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dezk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TokenizeAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dezk();
    public int a;
    public long b;
    public String c;
    public byte[] d;
    public String e;
    public long f;
    public String g;

    public TokenizeAccountRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenizeAccountRequest) {
            TokenizeAccountRequest tokenizeAccountRequest = (TokenizeAccountRequest) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(tokenizeAccountRequest.a)) && arwb.b(Long.valueOf(this.b), Long.valueOf(tokenizeAccountRequest.b)) && arwb.b(this.c, tokenizeAccountRequest.c) && Arrays.equals(this.d, tokenizeAccountRequest.d) && arwb.b(this.e, tokenizeAccountRequest.e) && arwb.b(Long.valueOf(this.f), Long.valueOf(tokenizeAccountRequest.f)) && arwb.b(this.g, tokenizeAccountRequest.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Long.valueOf(this.f), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.q(parcel, 6, this.f);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }

    public TokenizeAccountRequest(int i, long j, String str, byte[] bArr, String str2, long j2, String str3) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = bArr;
        this.e = str2;
        this.f = j2;
        this.g = str3;
    }
}
