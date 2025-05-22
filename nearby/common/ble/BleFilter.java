package com.google.android.gms.nearby.common.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chfk;
import defpackage.chfm;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class BleFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chfk();
    public final String a;
    public final String b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final ParcelUuid e;
    public final byte[] f;
    public final byte[] g;
    public final int h;
    public final byte[] i;
    public final byte[] j;

    public BleFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        this.a = str;
        this.c = parcelUuid;
        this.d = parcelUuid2;
        this.b = str2;
        this.e = parcelUuid3;
        this.f = bArr;
        this.g = bArr2;
        this.h = i;
        this.i = bArr3;
        this.j = bArr4;
    }

    static boolean c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr2[i2];
            if ((bArr3[i2] & b) != (b & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List list) {
        UUID uuid = parcelUuid2 == null ? null : parcelUuid2.getUuid();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParcelUuid parcelUuid3 = (ParcelUuid) it.next();
            UUID uuid2 = parcelUuid.getUuid();
            UUID uuid3 = parcelUuid3.getUuid();
            if (uuid == null) {
                if (uuid2.equals(uuid3)) {
                    return true;
                }
            } else if ((uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits())) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if ((Arrays.equals(bArr, bArr3) && Arrays.equals(bArr2, bArr4)) || bArr == null) {
            return true;
        }
        if (bArr3 == null) {
            return false;
        }
        if (bArr2 != null && bArr4 != null) {
            int i = 0;
            for (int i2 = 0; i < bArr2.length && i2 < bArr4.length; i2++) {
                byte b = bArr2[i];
                if ((bArr4[i2] & b) != b) {
                    return false;
                }
                i++;
            }
        }
        return c(bArr, bArr2, bArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r1.equals(r4) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if ((r8 & r12) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (d(r1, r3, java.util.Arrays.asList(r4)) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.nearby.common.ble.BleFilter r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 != 0) goto L4
            return r0
        L4:
            boolean r1 = r14.equals(r15)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.lang.String r1 = r14.b
            if (r1 == 0) goto L1a
            java.lang.String r3 = r15.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            java.lang.String r1 = r14.a
            if (r1 == 0) goto L28
            java.lang.String r3 = r15.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L27
            goto L28
        L27:
            return r0
        L28:
            android.os.ParcelUuid r1 = r14.c
            if (r1 == 0) goto L7a
            android.os.ParcelUuid r3 = r14.d
            android.os.ParcelUuid r4 = r15.c
            android.os.ParcelUuid r5 = r15.d
            if (r4 != 0) goto L35
            goto L79
        L35:
            if (r3 != 0) goto L3e
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L79
            goto L7a
        L3e:
            if (r5 == 0) goto L6b
            java.util.UUID r6 = r3.getUuid()
            long r6 = r6.getMostSignificantBits()
            java.util.UUID r8 = r3.getUuid()
            long r8 = r8.getLeastSignificantBits()
            java.util.UUID r10 = r5.getUuid()
            long r10 = r10.getMostSignificantBits()
            java.util.UUID r5 = r5.getUuid()
            long r12 = r5.getLeastSignificantBits()
            long r10 = r10 & r6
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 != 0) goto L79
            long r5 = r8 & r12
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L79
        L6b:
            android.os.ParcelUuid[] r5 = new android.os.ParcelUuid[r2]
            r5[r0] = r4
            java.util.List r4 = java.util.Arrays.asList(r5)
            boolean r1 = d(r1, r3, r4)
            if (r1 != 0) goto L7a
        L79:
            return r0
        L7a:
            android.os.ParcelUuid r1 = r14.e
            if (r1 == 0) goto L96
            android.os.ParcelUuid r3 = r15.e
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L95
            byte[] r1 = r14.f
            byte[] r3 = r14.g
            byte[] r4 = r15.f
            byte[] r5 = r15.g
            boolean r1 = e(r1, r3, r4, r5)
            if (r1 == 0) goto L95
            goto L96
        L95:
            return r0
        L96:
            int r1 = r14.h
            if (r1 < 0) goto Lad
            int r3 = r15.h
            if (r1 != r3) goto Lac
            byte[] r1 = r14.i
            byte[] r3 = r14.j
            byte[] r4 = r15.i
            byte[] r15 = r15.j
            boolean r15 = e(r1, r3, r4, r15)
            if (r15 != 0) goto Lad
        Lac:
            return r0
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.common.ble.BleFilter.a(com.google.android.gms.nearby.common.ble.BleFilter):boolean");
    }

    public final boolean b(BleSighting bleSighting) {
        BluetoothDevice bluetoothDevice;
        String str = this.b;
        if (str != null && ((bluetoothDevice = bleSighting.a) == null || !str.equals(bluetoothDevice.getAddress()))) {
            return false;
        }
        chfm chfmVar = bleSighting.b;
        String str2 = this.a;
        if (str2 != null && !str2.equals(chfmVar.d)) {
            return false;
        }
        ParcelUuid parcelUuid = this.c;
        if (parcelUuid != null && !d(parcelUuid, this.d, chfmVar.a)) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.e;
        if (parcelUuid2 != null && !c(this.f, this.g, chfmVar.c(parcelUuid2))) {
            return false;
        }
        int i = this.h;
        return i < 0 || c(this.i, this.j, chfmVar.b(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleFilter bleFilter = (BleFilter) obj;
            if (atyq.b(this.a, bleFilter.a) && atyq.b(this.b, bleFilter.b) && this.h == bleFilter.h && Arrays.equals(this.i, bleFilter.i) && Arrays.equals(this.j, bleFilter.j) && atyq.b(this.e, bleFilter.e) && Arrays.equals(this.f, bleFilter.f) && Arrays.equals(this.g, bleFilter.g) && atyq.b(this.c, bleFilter.c) && atyq.b(this.d, bleFilter.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), this.e, Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), this.c, this.d});
    }

    public final String toString() {
        byte[] bArr = this.j;
        byte[] bArr2 = this.i;
        byte[] bArr3 = this.g;
        byte[] bArr4 = this.f;
        ParcelUuid parcelUuid = this.e;
        ParcelUuid parcelUuid2 = this.d;
        return "BleFilter [deviceName=" + this.a + ", deviceAddress=" + this.b + ", uuid=" + String.valueOf(this.c) + ", uuidMask=" + String.valueOf(parcelUuid2) + ", serviceDataUuid=" + String.valueOf(parcelUuid) + ", serviceData=" + Arrays.toString(bArr4) + ", serviceDataMask=" + Arrays.toString(bArr3) + ", manufacturerId=" + this.h + ", manufacturerData=" + Arrays.toString(bArr2) + ", manufacturerDataMask=" + Arrays.toString(bArr) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.i(parcel, 7, this.f, false);
        atzr.i(parcel, 8, this.g, false);
        atzr.o(parcel, 9, this.h);
        atzr.i(parcel, 10, this.i, false);
        atzr.i(parcel, 11, this.j, false);
        atzr.c(parcel, a);
    }
}
