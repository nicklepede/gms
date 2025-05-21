package com.google.android.gms.ads.cache;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.chimera.modules.admob.AppContextProvider;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import defpackage.arwm;
import defpackage.aspm;
import defpackage.bqux;
import defpackage.eiif;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feeq;
import defpackage.fmut;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f {
    public final com.google.android.gms.ads.cache.io.b a;
    public final ThreadPoolExecutor b;
    public final com.google.android.gms.ads.internal.util.client.m c;
    public final WeakHashMap d;
    public int e;
    public final com.google.android.gms.ads.nonagon.csi.i f;
    private final Context g;
    private final LevelDb h;
    private final com.google.android.gms.ads.internal.js.function.o i;

    public f(Context context, com.google.android.gms.ads.cache.io.b bVar, com.google.android.gms.ads.internal.js.function.k kVar, ThreadPoolExecutor threadPoolExecutor, com.google.android.gms.ads.internal.util.client.m mVar) {
        try {
            com.google.android.gms.ads.internal.config.p.c(AppContextProvider.a());
            this.g = context;
            this.a = bVar;
            this.h = LevelDb.open(context.getDir("ads_cache", 0));
            this.d = new WeakHashMap();
            this.i = kVar.a("AFMA_updateCache", com.google.android.gms.ads.cache.policy.k.a, com.google.android.gms.ads.cache.policy.m.a);
            this.b = threadPoolExecutor;
            this.c = mVar;
            this.f = new com.google.android.gms.ads.nonagon.csi.i(threadPoolExecutor, mVar, new com.google.android.gms.ads.nonagon.util.logging.csi.c(), context, null);
        } catch (LevelDbException e) {
            throw new g("Unable to create Cache!", e);
        }
    }

    private final void i(LevelDb levelDb, byte[] bArr, byte[] bArr2, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
            levelDb.put(bArr, bArr2);
            return;
        }
        com.google.android.gms.ads.cache.csi.b bVar = new com.google.android.gms.ads.cache.csi.b("dbPut", str, this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
        try {
            levelDb.put(bArr, bArr2);
            bVar.close();
        } finally {
        }
    }

    private final void j(LevelDb.Iterator iterator) {
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
            iterator.close();
            return;
        }
        com.google.android.gms.ads.cache.csi.b bVar = new com.google.android.gms.ads.cache.csi.b("iteratorClose", "getCacheState", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
        try {
            iterator.close();
            bVar.close();
        } finally {
        }
    }

    private static void k(CacheOffering cacheOffering, fecj fecjVar) {
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        q qVar = (q) fecjVar.b;
        q qVar2 = q.a;
        qVar.c = feeq.a;
        Bundle bundle = cacheOffering.f;
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (!TextUtils.isEmpty(string)) {
                fecj v = p.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                p pVar = (p) fecpVar;
                str.getClass();
                pVar.b |= 1;
                pVar.c = str;
                if (!fecpVar.L()) {
                    v.U();
                }
                p pVar2 = (p) v.b;
                string.getClass();
                pVar2.b |= 2;
                pVar2.d = string;
                fecjVar.bP(v);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0449 A[Catch: all -> 0x04f7, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04ac A[Catch: all -> 0x04f7, LOOP:3: B:129:0x04a6->B:131:0x04ac, LOOP_END, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04c9 A[Catch: all -> 0x04f7, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e5 A[Catch: all -> 0x04f7, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d5 A[Catch: a -> 0x04b6, all -> 0x04f7, TryCatch #1 {a -> 0x04b6, blocks: (B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5), top: B:88:0x033a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b8 A[Catch: all -> 0x04f7, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4 A[Catch: all -> 0x04f7, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0330 A[Catch: all -> 0x04f7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a7 A[Catch: a -> 0x04b6, all -> 0x04f7, TRY_LEAVE, TryCatch #1 {a -> 0x04b6, blocks: (B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5), top: B:88:0x033a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0409 A[Catch: all -> 0x04f7, LOOP:1: B:97:0x0403->B:99:0x0409, LOOP_END, TryCatch #2 {, blocks: (B:4:0x0007, B:9:0x002a, B:11:0x0030, B:13:0x003b, B:14:0x0099, B:16:0x00a4, B:18:0x00b2, B:19:0x00b5, B:21:0x00c0, B:22:0x00cd, B:24:0x00d3, B:30:0x00e5, B:31:0x00e2, B:34:0x00e8, B:35:0x0107, B:37:0x010f, B:38:0x0112, B:40:0x012e, B:41:0x0131, B:43:0x0145, B:44:0x0148, B:46:0x015c, B:47:0x015f, B:49:0x0184, B:50:0x0187, B:52:0x019e, B:53:0x01a1, B:55:0x01b5, B:56:0x01b8, B:59:0x01dd, B:61:0x01e3, B:63:0x01f1, B:64:0x01f4, B:66:0x0206, B:67:0x0209, B:69:0x021c, B:70:0x021f, B:72:0x0233, B:73:0x0236, B:74:0x024b, B:76:0x0260, B:77:0x0263, B:79:0x0276, B:80:0x0279, B:82:0x028f, B:83:0x0292, B:85:0x032a, B:87:0x0330, B:89:0x033a, B:91:0x03a7, B:94:0x03c6, B:95:0x03df, B:96:0x03e1, B:97:0x0403, B:99:0x0409, B:101:0x0426, B:102:0x0443, B:104:0x0449, B:120:0x045b, B:123:0x046b, B:117:0x047c, B:112:0x048d, B:128:0x049c, B:129:0x04a6, B:131:0x04ac, B:134:0x04c9, B:137:0x04d5, B:138:0x04ef, B:139:0x04f5, B:143:0x04e5, B:153:0x03d4, B:152:0x03d1, B:154:0x03d5, B:156:0x04b7, B:160:0x04c0, B:163:0x02b0, B:164:0x02b7, B:165:0x02b8, B:167:0x02bc, B:168:0x02be, B:170:0x02d6, B:171:0x02d9, B:173:0x02f2, B:174:0x02f5, B:176:0x0310, B:180:0x0322, B:181:0x0040, B:182:0x0035, B:183:0x0095), top: B:3:0x0007, inners: #1, #3, #4, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.ads.cache.e a(com.google.android.gms.ads.internal.cache.CacheOffering r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.cache.f.a(com.google.android.gms.ads.internal.cache.CacheOffering, boolean):com.google.android.gms.ads.cache.e");
    }

    public final s b(byte[] bArr) {
        byte[] bArr2;
        try {
            LevelDb levelDb = this.h;
            if (((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
                com.google.android.gms.ads.cache.csi.b bVar = new com.google.android.gms.ads.cache.csi.b("dbGet", "getCacheEntrySnapshot", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
                try {
                    bArr2 = levelDb.get(bArr);
                    bVar.close();
                } finally {
                }
            } else {
                bArr2 = levelDb.get(bArr);
            }
            if (bArr2 == null) {
                return null;
            }
            s sVar = s.a;
            int length = bArr2.length;
            febw febwVar = febw.a;
            feep feepVar = feep.a;
            fecp y = fecp.y(sVar, bArr2, 0, length, febw.a);
            fecp.M(y);
            return (s) y;
        } catch (LevelDbException | fedk e) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Unable to read cache entry from LevelDB.", e);
            return null;
        }
    }

    public final com.google.android.gms.ads.cache.io.e c(s sVar) {
        File file = fmut.i() ? new File(bqux.a.b(this.g.getCacheDir(), "ads_cache")) : new File(this.g.getCacheDir(), "ads_cache");
        file.mkdirs();
        File file2 = fmut.i() ? new File(bqux.a.b(file, sVar.g)) : new File(file, sVar.g);
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
                return com.google.android.gms.ads.cache.io.g.a.a(file2);
            }
            com.google.android.gms.ads.cache.csi.b bVar = new com.google.android.gms.ads.cache.csi.b("openStreamingFile", "getStreamingFile", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
            try {
                com.google.android.gms.ads.cache.io.e a = com.google.android.gms.ads.cache.io.g.a.a(file2);
                bVar.close();
                return a;
            } finally {
            }
        } catch (IOException e) {
            throw new g("Unable to open cache data file.", e);
        }
    }

    public final com.google.android.gms.ads.cache.policy.b d() {
        com.google.android.gms.ads.cache.policy.b bVar;
        LevelDb.Iterator it;
        boolean isValid;
        byte[] value;
        com.google.android.gms.ads.cache.csi.b bVar2;
        synchronized (this.a) {
            bVar = new com.google.android.gms.ads.cache.policy.b();
            LevelDb levelDb = this.h;
            if (((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
                com.google.android.gms.ads.cache.csi.b bVar3 = new com.google.android.gms.ads.cache.csi.b("dbIterator", "getCacheState", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
                try {
                    it = levelDb.iterator();
                    bVar3.close();
                } finally {
                }
            } else {
                it = levelDb.iterator();
            }
            try {
                try {
                    if (((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
                        bVar2 = new com.google.android.gms.ads.cache.csi.b("iteratorSeekToFirst", "getCacheState", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
                        try {
                            it.seekToFirst();
                            bVar2.close();
                        } finally {
                            try {
                                bVar2.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } else {
                        it.seekToFirst();
                    }
                    while (true) {
                        com.google.android.gms.ads.internal.config.g gVar = com.google.android.gms.ads.internal.config.p.ao;
                        if (((Boolean) gVar.g()).booleanValue()) {
                            com.google.android.gms.ads.cache.csi.b bVar4 = new com.google.android.gms.ads.cache.csi.b("iteratorIsValid", "getCacheState", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
                            try {
                                isValid = it.isValid();
                                bVar4.close();
                            } finally {
                                try {
                                    bVar4.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        } else {
                            isValid = it.isValid();
                        }
                        if (isValid) {
                            if (((Boolean) gVar.g()).booleanValue()) {
                                bVar2 = new com.google.android.gms.ads.cache.csi.b("iteratorValue", "getCacheState", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
                                try {
                                    value = it.value();
                                    bVar2.close();
                                } finally {
                                }
                            } else {
                                value = it.value();
                            }
                            s sVar = s.a;
                            int length = value.length;
                            febw febwVar = febw.a;
                            feep feepVar = feep.a;
                            fecp y = fecp.y(sVar, value, 0, length, febw.a);
                            fecp.M(y);
                            s sVar2 = (s) y;
                            com.google.android.gms.ads.cache.io.e c = c(sVar2);
                            fecj w = s.a.w(sVar2);
                            q qVar = sVar2.f;
                            if (qVar == null) {
                                qVar = q.a;
                            }
                            fecj w2 = q.a.w(qVar);
                            long a = c.a();
                            if (!w2.b.L()) {
                                w2.U();
                            }
                            q qVar2 = (q) w2.b;
                            qVar2.b |= 4;
                            qVar2.f = a;
                            if (!w.b.L()) {
                                w.U();
                            }
                            s sVar3 = (s) w.b;
                            q qVar3 = (q) w2.Q();
                            qVar3.getClass();
                            sVar3.f = qVar3;
                            sVar3.b |= 8;
                            s sVar4 = (s) w.Q();
                            g(c, "getCacheState");
                            bVar.c(sVar4);
                            if (((Boolean) gVar.g()).booleanValue()) {
                                bVar2 = new com.google.android.gms.ads.cache.csi.b("iteratorNext", "getCacheState", this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
                                try {
                                    it.next();
                                    bVar2.close();
                                } finally {
                                }
                            } else {
                                it.next();
                            }
                        }
                    }
                } catch (IOException e) {
                    throw new g("Unable to get state of cache.", e);
                }
            } finally {
                j(it);
            }
        }
        return bVar;
    }

    public final OutputStream e(com.google.android.gms.ads.cache.io.e eVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
            return eVar.c();
        }
        com.google.android.gms.ads.cache.csi.b bVar = new com.google.android.gms.ads.cache.csi.b("getOutputStream", str, this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
        try {
            OutputStream c = eVar.c();
            bVar.close();
            return c;
        } finally {
        }
    }

    public final void f(s sVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String a;
        synchronized (this.a) {
            try {
                str = sVar.c;
                m mVar = sVar.d;
                if (mVar == null) {
                    mVar = m.a;
                }
                str2 = mVar.c;
                m mVar2 = sVar.d;
                if (mVar2 == null) {
                    mVar2 = m.a;
                }
                str3 = mVar2.d;
                r rVar = sVar.e;
                if (rVar == null) {
                    rVar = r.a;
                }
                str4 = rVar.c;
                q qVar = sVar.f;
                if (qVar == null) {
                    qVar = q.a;
                }
                Iterator it = qVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str5 = null;
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar.c.equals("check_url")) {
                        str5 = pVar.d;
                        break;
                    }
                }
            } catch (g | LevelDbException e) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.h("Unable to add entry to DB.", e);
            }
            if (((Boolean) com.google.android.gms.ads.internal.config.p.aq.g()).booleanValue() && (str4 != null || str5 != null)) {
                String b = eiif.c(str4) ? h.b(str5) : h.b(str4);
                if (b == null) {
                    a = h.a(str, str2, str3);
                } else {
                    arwm.s(str);
                    arwm.s(str2);
                    arwm.s(str3);
                    a = defpackage.a.ad(b, str3, new StringBuilder(), str2, str);
                }
                i(this.h, h.c(a), sVar.r(), "addOrUpdateEntry");
                this.e++;
            }
            a = h.a(str, str2, str3);
            i(this.h, h.c(a), sVar.r(), "addOrUpdateEntry");
            this.e++;
        }
    }

    public final void g(com.google.android.gms.ads.cache.io.e eVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.ao.g()).booleanValue()) {
            aspm.b(eVar);
            return;
        }
        com.google.android.gms.ads.cache.csi.b bVar = new com.google.android.gms.ads.cache.csi.b("closeQuietly", str, this.f, ((Long) com.google.android.gms.ads.internal.config.p.ap.g()).longValue());
        try {
            aspm.b(eVar);
            bVar.close();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc A[Catch: all -> 0x0047, LevelDbException -> 0x0164, g | LevelDbException -> 0x0166, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x002f, B:10:0x0041, B:11:0x0055, B:13:0x005b, B:14:0x005d, B:16:0x0062, B:18:0x0068, B:19:0x006a, B:21:0x0070, B:22:0x0072, B:24:0x0078, B:25:0x007a, B:27:0x0080, B:28:0x0082, B:29:0x0088, B:31:0x008e, B:34:0x009e, B:35:0x00a2, B:40:0x00b5, B:42:0x00bb, B:44:0x00c6, B:45:0x00e2, B:46:0x00f6, B:48:0x00fc, B:51:0x010a, B:56:0x010e, B:57:0x0112, B:59:0x0118, B:61:0x0122, B:63:0x0134, B:66:0x014c, B:67:0x015e, B:68:0x016f, B:80:0x015a, B:79:0x0157, B:81:0x015b, B:82:0x00cb, B:83:0x00c0, B:84:0x00de, B:90:0x0168, B:100:0x003d, B:99:0x003a, B:101:0x003e, B:107:0x004e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118 A[Catch: all -> 0x0047, LevelDbException -> 0x0164, g | LevelDbException -> 0x0166, LOOP:2: B:57:0x0112->B:59:0x0118, LOOP_END, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x002f, B:10:0x0041, B:11:0x0055, B:13:0x005b, B:14:0x005d, B:16:0x0062, B:18:0x0068, B:19:0x006a, B:21:0x0070, B:22:0x0072, B:24:0x0078, B:25:0x007a, B:27:0x0080, B:28:0x0082, B:29:0x0088, B:31:0x008e, B:34:0x009e, B:35:0x00a2, B:40:0x00b5, B:42:0x00bb, B:44:0x00c6, B:45:0x00e2, B:46:0x00f6, B:48:0x00fc, B:51:0x010a, B:56:0x010e, B:57:0x0112, B:59:0x0118, B:61:0x0122, B:63:0x0134, B:66:0x014c, B:67:0x015e, B:68:0x016f, B:80:0x015a, B:79:0x0157, B:81:0x015b, B:82:0x00cb, B:83:0x00c0, B:84:0x00de, B:90:0x0168, B:100:0x003d, B:99:0x003a, B:101:0x003e, B:107:0x004e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134 A[Catch: all -> 0x0047, LevelDbException -> 0x0164, g | LevelDbException -> 0x0166, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x002f, B:10:0x0041, B:11:0x0055, B:13:0x005b, B:14:0x005d, B:16:0x0062, B:18:0x0068, B:19:0x006a, B:21:0x0070, B:22:0x0072, B:24:0x0078, B:25:0x007a, B:27:0x0080, B:28:0x0082, B:29:0x0088, B:31:0x008e, B:34:0x009e, B:35:0x00a2, B:40:0x00b5, B:42:0x00bb, B:44:0x00c6, B:45:0x00e2, B:46:0x00f6, B:48:0x00fc, B:51:0x010a, B:56:0x010e, B:57:0x0112, B:59:0x0118, B:61:0x0122, B:63:0x0134, B:66:0x014c, B:67:0x015e, B:68:0x016f, B:80:0x015a, B:79:0x0157, B:81:0x015b, B:82:0x00cb, B:83:0x00c0, B:84:0x00de, B:90:0x0168, B:100:0x003d, B:99:0x003a, B:101:0x003e, B:107:0x004e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b A[Catch: all -> 0x0047, LevelDbException -> 0x0164, g | LevelDbException -> 0x0166, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x002f, B:10:0x0041, B:11:0x0055, B:13:0x005b, B:14:0x005d, B:16:0x0062, B:18:0x0068, B:19:0x006a, B:21:0x0070, B:22:0x0072, B:24:0x0078, B:25:0x007a, B:27:0x0080, B:28:0x0082, B:29:0x0088, B:31:0x008e, B:34:0x009e, B:35:0x00a2, B:40:0x00b5, B:42:0x00bb, B:44:0x00c6, B:45:0x00e2, B:46:0x00f6, B:48:0x00fc, B:51:0x010a, B:56:0x010e, B:57:0x0112, B:59:0x0118, B:61:0x0122, B:63:0x0134, B:66:0x014c, B:67:0x015e, B:68:0x016f, B:80:0x015a, B:79:0x0157, B:81:0x015b, B:82:0x00cb, B:83:0x00c0, B:84:0x00de, B:90:0x0168, B:100:0x003d, B:99:0x003a, B:101:0x003e, B:107:0x004e), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.google.android.gms.ads.cache.s r10) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.cache.f.h(com.google.android.gms.ads.cache.s):void");
    }
}
