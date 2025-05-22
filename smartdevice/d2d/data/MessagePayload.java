package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakePayload;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.dfre;
import defpackage.fywe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class MessagePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfre();
    private static final HashMap v;
    public final Set a;
    public final int b;
    public int c;
    public BootstrapOptions d;
    public BootstrapConfigurations e;
    public DisplayText f;
    public AccountBootstrapPayload g;
    public ProgressEvent h;
    public boolean i;
    public ArrayList j;
    public AccountTransferPayload k;
    public DeviceStatus l;
    public WorkProfilePayload m;
    public ArrayList n;
    public BlockstorePayload o;
    public SecondDeviceAuthPayload p;
    public ArrayList q;
    public byte[] r;
    public StartServicePayload s;
    public QuickStartHandshakePayload t;
    public PostTransferAction u;
    private int w;
    private boolean x;
    private boolean y;

    static {
        HashMap hashMap = new HashMap();
        v = hashMap;
        hashMap.put("protocolVersion", new FastJsonResponse$Field(0, false, 0, false, "protocolVersion", 7, null));
        hashMap.put("bootstrapState", new FastJsonResponse$Field(0, false, 0, false, "bootstrapState", 2, null));
        hashMap.put("bootstrapOptions", new FastJsonResponse$Field(11, false, 11, false, "bootstrapOptions", 3, BootstrapOptions.class));
        hashMap.put("bootstrapConfigurations", new FastJsonResponse$Field(11, false, 11, false, "bootstrapConfigurations", 4, BootstrapConfigurations.class));
        hashMap.put("displayText", new FastJsonResponse$Field(11, false, 11, false, "displayText", 5, DisplayText.class));
        hashMap.put("accountBootstrapPayload", new FastJsonResponse$Field(11, false, 11, false, "accountBootstrapPayload", 6, AccountBootstrapPayload.class));
        hashMap.put("progressEvent", new FastJsonResponse$Field(11, false, 11, false, "progressEvent", 8, ProgressEvent.class));
        hashMap.put("priorityMessage", new FastJsonResponse$Field(6, false, 6, false, "priorityMessage", 9, null));
        hashMap.put("accountTransferResults", new FastJsonResponse$Field(11, true, 11, true, "accountTransferResults", 10, AccountTransferResult.class));
        hashMap.put("accountTransferMsg", new FastJsonResponse$Field(11, false, 11, false, "accountTransferMsg", 11, AccountTransferPayload.class));
        hashMap.put("deviceStatus", new FastJsonResponse$Field(11, false, 11, false, "deviceStatus", 12, DeviceStatus.class));
        hashMap.put("workProfilePayload", new FastJsonResponse$Field(11, false, 11, false, "workProfilePayload", 13, WorkProfilePayload.class));
        hashMap.put("esimActivationPayloads", new FastJsonResponse$Field(11, true, 11, true, "esimActivationPayloads", 14, EsimActivationPayload.class));
        hashMap.put("blockstorePayload", new FastJsonResponse$Field(11, false, 11, false, "blockstorePayload", 15, BlockstorePayload.class));
        hashMap.put("secondDeviceAuthPayload", new FastJsonResponse$Field(11, false, 11, false, "secondDeviceAuthPayload", 16, SecondDeviceAuthPayload.class));
        hashMap.put("folsomDataPayload", new FastJsonResponse$Field(11, true, 11, true, "folsomDataPayload", 17, FolsomDataPayload.class));
        hashMap.put("quickStartPayload", new FastJsonResponse$Field(8, false, 8, false, "quickStartPayload", 18, null));
        hashMap.put("startServicePayload", new FastJsonResponse$Field(11, false, 11, false, "startServicePayload", 19, StartServicePayload.class));
        hashMap.put("quickStartHandshakePayload", new FastJsonResponse$Field(11, false, 11, false, "quickStartHandshakePayload", 20, QuickStartHandshakePayload.class));
        hashMap.put("PostTransferAction", new FastJsonResponse$Field(11, false, 11, false, "PostTransferAction", 21, PostTransferAction.class));
    }

    public MessagePayload(Set set, int i, int i2, int i3, BootstrapOptions bootstrapOptions, BootstrapConfigurations bootstrapConfigurations, DisplayText displayText, AccountBootstrapPayload accountBootstrapPayload, ProgressEvent progressEvent, boolean z, ArrayList arrayList, AccountTransferPayload accountTransferPayload, DeviceStatus deviceStatus, WorkProfilePayload workProfilePayload, ArrayList arrayList2, BlockstorePayload blockstorePayload, SecondDeviceAuthPayload secondDeviceAuthPayload, ArrayList arrayList3, byte[] bArr, StartServicePayload startServicePayload, QuickStartHandshakePayload quickStartHandshakePayload, PostTransferAction postTransferAction) {
        this.x = false;
        this.y = false;
        this.a = set;
        this.b = i;
        this.w = i2;
        this.c = i3;
        this.d = bootstrapOptions;
        this.e = bootstrapConfigurations;
        this.f = displayText;
        this.g = accountBootstrapPayload;
        this.h = progressEvent;
        this.i = z;
        this.j = arrayList;
        this.k = accountTransferPayload;
        this.l = deviceStatus;
        this.m = workProfilePayload;
        this.n = arrayList2;
        this.o = blockstorePayload;
        this.p = secondDeviceAuthPayload;
        this.q = arrayList3;
        this.r = bArr;
        this.s = startServicePayload;
        this.t = quickStartHandshakePayload;
        this.u = postTransferAction;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.b);
            case 2:
                return Integer.valueOf(this.c);
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 7:
                return Integer.valueOf(p());
            case 8:
                return this.h;
            case 9:
                return Boolean.valueOf(this.i);
            case 10:
                return this.j;
            case 11:
                return this.k;
            case 12:
                return this.l;
            case 13:
                return this.m;
            case 14:
                return this.n;
            case 15:
                return this.o;
            case 16:
                return this.p;
            case fywe.q /* 17 */:
                return this.q;
            case 18:
                return this.r;
            case 19:
                return this.s;
            case fywe.t /* 20 */:
                return this.t;
            case fywe.u /* 21 */:
                return this.u;
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    public final void aj(String str) {
        this.f = new DisplayText(str);
        this.a.add(5);
    }

    public final void ak(ArrayList arrayList) {
        this.n = arrayList;
        this.a.add(14);
    }

    public final void al(QuickStartHandshakePayload quickStartHandshakePayload) {
        this.t = quickStartHandshakePayload;
        this.a.add(20);
    }

    public final void am(byte[] bArr) {
        this.r = bArr;
        this.a.add(18);
    }

    public final void an(SecondDeviceAuthPayload secondDeviceAuthPayload) {
        this.p = secondDeviceAuthPayload;
        this.a.add(16);
    }

    public final void ao(StartServicePayload startServicePayload) {
        this.s = startServicePayload;
        this.a.add(19);
    }

    public final void ap(WorkProfilePayload workProfilePayload) {
        this.m = workProfilePayload;
        this.a.add(13);
    }

    public final void aq(ArrayList arrayList) {
        this.q = arrayList;
        this.a.add(17);
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return v;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 10) {
            this.j = arrayList;
        } else if (i == 14) {
            this.n = arrayList;
        } else {
            if (i != 17) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
            }
            this.q = arrayList;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        this.x = true;
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 3:
                this.d = (BootstrapOptions) aulmVar;
                break;
            case 4:
                this.e = (BootstrapConfigurations) aulmVar;
                break;
            case 5:
                this.f = (DisplayText) aulmVar;
                break;
            case 6:
                this.g = (AccountBootstrapPayload) aulmVar;
                break;
            case 7:
            case 9:
            case 10:
            case 14:
            case fywe.q /* 17 */:
            case 18:
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), aulmVar.getClass().getCanonicalName()));
            case 8:
                this.h = (ProgressEvent) aulmVar;
                break;
            case 11:
                this.k = (AccountTransferPayload) aulmVar;
                break;
            case 12:
                this.l = (DeviceStatus) aulmVar;
                break;
            case 13:
                this.m = (WorkProfilePayload) aulmVar;
                break;
            case 15:
                this.o = (BlockstorePayload) aulmVar;
                break;
            case 16:
                this.p = (SecondDeviceAuthPayload) aulmVar;
                break;
            case 19:
                this.s = (StartServicePayload) aulmVar;
                break;
            case fywe.t /* 20 */:
                this.t = (QuickStartHandshakePayload) aulmVar;
                break;
            case fywe.u /* 21 */:
                this.u = (PostTransferAction) aulmVar;
                break;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        this.x = true;
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = i;
        } else {
            if (i2 != 7) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
            }
            this.w = i;
            this.y = true;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i != 18) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array"));
        }
        this.r = bArr;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i != 9) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
        }
        this.i = z;
        this.a.add(Integer.valueOf(i));
    }

    public final int p() {
        if (!this.x || this.y) {
            return this.w;
        }
        return 0;
    }

    public final String q() {
        StringBuilder sb = new StringBuilder("MessagePayload[bootstrapState=");
        sb.append(this.c);
        if (this.d != null) {
            sb.append(" bootstrapOptions=ELIDED");
        }
        if (this.e != null) {
            sb.append(" bootstrapConfigurations=ELIDED");
        }
        if (this.f != null) {
            sb.append(" displayText=\"");
            sb.append(this.f);
            sb.append("\"");
        }
        if (this.g != null) {
            sb.append(" accountBootstrapPayload=ELIDED");
        }
        if (this.h != null) {
            sb.append(" progressEvent=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" accountTransferPayload=ELIDED");
        }
        if (this.j != null) {
            sb.append(" accountTransferResults=ELIDED");
        }
        if (this.l != null) {
            sb.append(" deviceStatus=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(" workProfilePayload=ELIDED");
        }
        if (this.n != null) {
            sb.append(" esimActivationPayloads=ELIDED");
        }
        if (this.o != null) {
            sb.append(" blockstorePayload=ELIDED");
        }
        if (this.p != null) {
            sb.append(" secondDeviceAuthPayload=ELIDED");
        }
        if (this.q != null) {
            sb.append(" folsomDataPayload=ELIDED");
        }
        if (this.r != null) {
            sb.append(" quickStartPayload=ELIDED");
        }
        if (this.s != null) {
            sb.append(" startServicePayload=ELIDED");
        }
        if (this.t != null) {
            sb.append(" quickStartHandShakePayload=ELIDED");
        }
        sb.append("]");
        return sb.toString();
    }

    public final void r(AccountBootstrapPayload accountBootstrapPayload) {
        this.g = accountBootstrapPayload;
        this.a.add(6);
    }

    public final void s(AccountTransferPayload accountTransferPayload) {
        this.k = accountTransferPayload;
        this.a.add(11);
    }

    public final void t(ArrayList arrayList) {
        this.j = arrayList;
        this.a.add(10);
    }

    public final void u(BlockstorePayload blockstorePayload) {
        this.o = blockstorePayload;
        this.a.add(15);
    }

    public final void v(BootstrapConfigurations bootstrapConfigurations) {
        this.e = bootstrapConfigurations;
        this.a.add(4);
    }

    public final void w(BootstrapOptions bootstrapOptions) {
        this.d = bootstrapOptions;
        this.a.add(3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.o(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            atzr.o(parcel, 2, this.c);
        }
        if (set.contains(3)) {
            atzr.t(parcel, 3, this.d, i, true);
        }
        if (set.contains(4)) {
            atzr.t(parcel, 4, this.e, i, true);
        }
        if (set.contains(5)) {
            atzr.t(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            atzr.t(parcel, 6, this.g, i, true);
        }
        if (set.contains(7)) {
            atzr.o(parcel, 7, p());
        }
        if (set.contains(8)) {
            atzr.t(parcel, 8, this.h, i, true);
        }
        if (set.contains(9)) {
            atzr.e(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            atzr.y(parcel, 10, this.j, true);
        }
        if (set.contains(11)) {
            atzr.t(parcel, 11, this.k, i, true);
        }
        if (set.contains(12)) {
            atzr.t(parcel, 12, this.l, i, true);
        }
        if (set.contains(13)) {
            atzr.t(parcel, 13, this.m, i, true);
        }
        if (set.contains(14)) {
            atzr.y(parcel, 14, this.n, true);
        }
        if (set.contains(15)) {
            atzr.t(parcel, 15, this.o, i, true);
        }
        if (set.contains(16)) {
            atzr.t(parcel, 16, this.p, i, true);
        }
        if (set.contains(17)) {
            atzr.y(parcel, 17, this.q, true);
        }
        if (set.contains(18)) {
            atzr.i(parcel, 18, this.r, true);
        }
        if (set.contains(19)) {
            atzr.t(parcel, 19, this.s, i, true);
        }
        if (set.contains(20)) {
            atzr.t(parcel, 20, this.t, i, true);
        }
        if (set.contains(21)) {
            atzr.t(parcel, 21, this.u, i, true);
        }
        atzr.c(parcel, a);
    }

    public final void x(int i) {
        this.c = i;
        this.a.add(2);
    }

    public final void y(DeviceStatus deviceStatus) {
        this.l = deviceStatus;
        this.a.add(12);
    }

    public MessagePayload() {
        this.c = 0;
        this.x = false;
        this.y = false;
        this.b = 3;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.w = 3;
        hashSet.add(7);
    }
}
