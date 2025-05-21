package com.google.android.gms.constellation.ottmessenger;

import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.asxw;
import defpackage.atlw;
import defpackage.atmg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class OttManager extends IntentOperation {
    private final arxo a = atmg.a("ott_manager");
    private atlw b;
    private asxw c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = atlw.a(getApplicationContext());
        this.c = new asxw(getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0152 A[Catch: IllegalStateException -> 0x005b, atmb -> 0x01b3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {atmb -> 0x01b3, blocks: (B:8:0x002e, B:10:0x0030, B:17:0x0057, B:21:0x0062, B:23:0x0076, B:24:0x0079, B:26:0x008b, B:27:0x008e, B:29:0x00aa, B:30:0x00ad, B:32:0x00b9, B:33:0x00bf, B:35:0x00e6, B:36:0x0105, B:139:0x0140, B:141:0x0152, B:142:0x0155, B:144:0x0174, B:145:0x019d, B:146:0x019e, B:147:0x01af), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0174 A[Catch: IllegalStateException -> 0x01b0, atmb -> 0x01b3, TryCatch #1 {atmb -> 0x01b3, blocks: (B:8:0x002e, B:10:0x0030, B:17:0x0057, B:21:0x0062, B:23:0x0076, B:24:0x0079, B:26:0x008b, B:27:0x008e, B:29:0x00aa, B:30:0x00ad, B:32:0x00b9, B:33:0x00bf, B:35:0x00e6, B:36:0x0105, B:139:0x0140, B:141:0x0152, B:142:0x0155, B:144:0x0174, B:145:0x019d, B:146:0x019e, B:147:0x01af), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019e A[Catch: IllegalStateException -> 0x01b0, atmb -> 0x01b3, TryCatch #1 {atmb -> 0x01b3, blocks: (B:8:0x002e, B:10:0x0030, B:17:0x0057, B:21:0x0062, B:23:0x0076, B:24:0x0079, B:26:0x008b, B:27:0x008e, B:29:0x00aa, B:30:0x00ad, B:32:0x00b9, B:33:0x00bf, B:35:0x00e6, B:36:0x0105, B:139:0x0140, B:141:0x0152, B:142:0x0155, B:144:0x0174, B:145:0x019d, B:146:0x019e, B:147:0x01af), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0586 A[Catch: atmb -> 0x05e5, IllegalStateException -> 0x05fa, TryCatch #21 {atmb -> 0x05e5, IllegalStateException -> 0x05fa, blocks: (B:180:0x04a2, B:182:0x04b7, B:184:0x04cb, B:185:0x04ce, B:187:0x04e4, B:188:0x04e7, B:190:0x04f9, B:191:0x04fc, B:193:0x0524, B:194:0x0543, B:195:0x0559, B:200:0x0574, B:202:0x0586, B:203:0x0589, B:205:0x05a9, B:206:0x05d2, B:207:0x05d3, B:208:0x05e4), top: B:179:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05a9 A[Catch: atmb -> 0x05e5, IllegalStateException -> 0x05fa, TryCatch #21 {atmb -> 0x05e5, IllegalStateException -> 0x05fa, blocks: (B:180:0x04a2, B:182:0x04b7, B:184:0x04cb, B:185:0x04ce, B:187:0x04e4, B:188:0x04e7, B:190:0x04f9, B:191:0x04fc, B:193:0x0524, B:194:0x0543, B:195:0x0559, B:200:0x0574, B:202:0x0586, B:203:0x0589, B:205:0x05a9, B:206:0x05d2, B:207:0x05d3, B:208:0x05e4), top: B:179:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05d3 A[Catch: atmb -> 0x05e5, IllegalStateException -> 0x05fa, TryCatch #21 {atmb -> 0x05e5, IllegalStateException -> 0x05fa, blocks: (B:180:0x04a2, B:182:0x04b7, B:184:0x04cb, B:185:0x04ce, B:187:0x04e4, B:188:0x04e7, B:190:0x04f9, B:191:0x04fc, B:193:0x0524, B:194:0x0543, B:195:0x0559, B:200:0x0574, B:202:0x0586, B:203:0x0589, B:205:0x05a9, B:206:0x05d2, B:207:0x05d3, B:208:0x05e4), top: B:179:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r31) {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.constellation.ottmessenger.OttManager.onHandleIntent(android.content.Intent):void");
    }
}
