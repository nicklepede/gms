package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dhrj;
import defpackage.dhrk;
import defpackage.dhrl;
import defpackage.dhrm;
import defpackage.dhrn;
import defpackage.elgx;
import defpackage.elhz;
import defpackage.emgt;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ThreadNetworkCredentials extends AbstractSafeParcelable {
    public long d;
    public long e;
    public final boolean f;
    public final dhrm g;
    public final String h;
    public final int i;
    public final int j;
    public final elhz k;
    public final int l;
    public final dhrl m;
    private final byte[] o;
    private final byte[] p;
    private final byte[] q;
    private final byte[] r;
    private final byte[] s;
    public static final Parcelable.Creator CREATOR = new dhrn();
    public static final dhrl a = new dhrl(672, new byte[]{-1, -8});
    public static final dhrk b = new dhrk(0, new byte[]{0, 31, -1, -32});
    private static final elgx n = elgx.t((byte) 0, "Channel", (byte) 1, "PAN ID", (byte) 2, "Extended PAN ID", (byte) 3, "Network Name", (byte) 4, "PSKc", (byte) 5, "Network Key", (byte) 7, "Mesh Local Prefix", (byte) 12, "Security Policy", (byte) 14, "Active Timestamp", (byte) 53, "Channel Mask");
    public static final Charset c = Charset.forName("UTF-8");

    public ThreadNetworkCredentials(byte[] bArr, long j, long j2, boolean z) {
        this.g = dhrm.c(f((byte) 14, bArr));
        this.h = new String(f((byte) 3, bArr), c);
        byte[] f = f((byte) 0, bArr);
        int i = f[0] & 255;
        int i2 = f[1] & 255;
        int i3 = f[2] & 255;
        Integer valueOf = Integer.valueOf(i);
        atzb.d(true, "Invalid Thread Channel Page (page = %d, allowedRange = [0, 255])", valueOf);
        int i4 = i3 | (i2 << 8);
        if (i != 0) {
            Integer valueOf2 = Integer.valueOf(i4);
            atzb.d(true, "Invalid Thread Channel %d in page %d (channel = %d, allowedRange = [0, 65535])", valueOf2, valueOf, valueOf2);
        } else {
            atzb.d(i4 >= 11 && i4 <= 26, "Invalid Thread Channel %d in page %d (allowedChannelRange = [%d, %d])", Integer.valueOf(i4), valueOf, 11, 26);
        }
        this.j = new int[]{i4, i}[0];
        this.i = i;
        this.k = dhrj.b(f((byte) 53, bArr));
        this.l = dhrj.a(f((byte) 1, bArr));
        this.p = f((byte) 2, bArr);
        this.q = f((byte) 4, bArr);
        byte[] f2 = f((byte) 7, bArr);
        dhrj.c(f2);
        this.r = f2;
        byte[] f3 = f((byte) 12, bArr);
        this.m = new dhrl(((f3[0] & 255) << 8) | (f3[1] & 255), Arrays.copyOfRange(f3, 2, f3.length));
        byte[] f4 = f((byte) 5, bArr);
        if (f4 == null) {
            throw new IllegalArgumentException("Thread Network Key is missing in the dataset");
        }
        this.s = f4;
        this.o = (byte[]) bArr.clone();
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e8, code lost:
    
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Found invalid Thread Network Name TLV (length = %d, expectedLengthRange = (0, %d])", java.lang.Integer.valueOf(r4), 16));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] f(byte r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.threadnetwork.ThreadNetworkCredentials.f(byte, byte[]):byte[]");
    }

    public final byte[] a() {
        return (byte[]) this.o.clone();
    }

    public final byte[] b() {
        return (byte[]) this.p.clone();
    }

    public final byte[] c() {
        return (byte[]) this.r.clone();
    }

    public final byte[] d() {
        return (byte[]) this.s.clone();
    }

    public final byte[] e() {
        return (byte[]) this.q.clone();
    }

    public final String toString() {
        return String.format(Locale.US, "{ExtendedPanId: %s, ActiveTimestamp: %s}", emgt.f.n(this.p), this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.i(parcel, 1, a(), false);
        atzr.q(parcel, 2, this.d);
        atzr.q(parcel, 3, this.e);
        atzr.e(parcel, 4, this.f);
        atzr.c(parcel, a2);
    }
}
