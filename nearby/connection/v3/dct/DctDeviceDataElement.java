package com.google.android.gms.nearby.connection.v3.dct;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cfef;
import defpackage.cgcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DctDeviceDataElement extends AbstractSafeParcelable {
    public final int a;
    public final int b;
    public final byte[] c;
    private static final Charset d = Charset.forName("UTF-8");
    public static final Parcelable.Creator CREATOR = new cgcm();

    public DctDeviceDataElement(int i, int i2, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        this.b = i2;
    }

    public final byte[] a() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = this.c;
            int i = this.a;
            int i2 = this.b;
            byteArrayOutputStream.write((i2 > 7 || i > 15) ? new byte[]{(byte) ((i2 & 127) | (-128)), (byte) i} : new byte[]{(byte) (((byte) i) | ((byte) (i2 << 4)))});
            byteArrayOutputStream.write(bArr);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.i("DctDeviceDataElement", "Failed to writebytes.");
            return new byte[0];
        }
    }

    public String toString() {
        String str;
        int i = this.a;
        String str2 = "UNKNOWN";
        switch (i) {
            case 1:
                str = new String(this.c, d);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                str = cfef.b(this.c);
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        switch (i) {
            case 1:
                str2 = "SESSION_ID";
                break;
            case 2:
                str2 = "DEVICE_PLATFORM";
                break;
            case 3:
                str2 = "TX_POWER";
                break;
            case 4:
                str2 = "BLE_L2_CAP_PSM";
                break;
            case 5:
                str2 = "SERVICE_ID_HASH";
                break;
            case 6:
                str2 = "SUPPORTED_SERVICES";
                break;
            case 7:
                str2 = "DEVICE_INFO";
                break;
        }
        return String.format("DctDataElement{type=%s, length=%s, value=%s}", str2, Integer.valueOf(this.b), str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
