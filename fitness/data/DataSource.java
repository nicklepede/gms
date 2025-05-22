package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bihu;
import defpackage.fkhs;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataSource extends AbstractSafeParcelable {
    public final DataType a;
    public final int b;
    public final Device c;
    public final Application d;
    public final String e;
    public final String f;
    private static final String g = fkhs.RAW.name().toLowerCase(Locale.ROOT);
    private static final String h = fkhs.DERIVED.name().toLowerCase(Locale.ROOT);
    public static final Parcelable.Creator CREATOR = new bihu();

    public DataSource(DataType dataType, int i, Device device, Application application, String str) {
        this.a = dataType;
        this.b = i;
        this.c = device;
        this.d = application;
        this.e = str;
        StringBuilder sb = new StringBuilder();
        sb.append(b(i));
        sb.append(":");
        sb.append(dataType.aI);
        if (application != null) {
            sb.append(":");
            sb.append(application.b);
        }
        if (device != null) {
            sb.append(":");
            sb.append(device.a());
        }
        if (str != null) {
            sb.append(":");
            sb.append(str);
        }
        this.f = sb.toString();
    }

    private static String b(int i) {
        return i != 0 ? i != 1 ? h : h : g;
    }

    public final String a() {
        String str;
        int i = this.b;
        String str2 = i != 0 ? i != 1 ? "?" : "d" : "r";
        DataType dataType = this.a;
        Application application = this.d;
        String a = dataType.a();
        String concat = application == null ? "" : application.equals(Application.a) ? ":gms" : ":".concat(application.b);
        Device device = this.c;
        if (device != null) {
            str = ":" + device.b + ":" + device.c;
        } else {
            str = "";
        }
        String str3 = this.e;
        return str2 + ":" + a + concat + str + (str3 != null ? ":".concat(str3) : "");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSource) {
            return this.f.equals(((DataSource) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSource{");
        sb.append(b(this.b));
        Application application = this.d;
        if (application != null) {
            sb.append(":");
            sb.append(application);
        }
        Device device = this.c;
        if (device != null) {
            sb.append(":");
            sb.append(device);
        }
        String str = this.e;
        if (str != null) {
            sb.append(":");
            sb.append(str);
        }
        sb.append(":");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataType dataType = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataType, i, false);
        atzr.o(parcel, 3, this.b);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.c(parcel, a);
    }
}
