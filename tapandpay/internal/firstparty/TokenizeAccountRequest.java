package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhkq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TokenizeAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhkq();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(tokenizeAccountRequest.a)) && atyq.b(Long.valueOf(this.b), Long.valueOf(tokenizeAccountRequest.b)) && atyq.b(this.c, tokenizeAccountRequest.c) && Arrays.equals(this.d, tokenizeAccountRequest.d) && atyq.b(this.e, tokenizeAccountRequest.e) && atyq.b(Long.valueOf(this.f), Long.valueOf(tokenizeAccountRequest.f)) && atyq.b(this.g, tokenizeAccountRequest.g)) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.q(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.q(parcel, 6, this.f);
        atzr.v(parcel, 7, this.g, false);
        atzr.c(parcel, a);
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
