package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.js.ag;
import com.google.android.gms.ads.internal.js.ah;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.atzb;
import defpackage.caqj;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.qmk;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class n extends WebViewClient implements com.google.android.gms.ads.internal.client.a, com.google.android.gms.ads.nonagon.ad.event.e {
    public static final /* synthetic */ int f = 0;
    public final i a;
    public com.google.android.gms.ads.internal.js.f e;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public boolean d = false;
    private final HashSet g = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.config.p.aH.g()).split(",")));

    public n(i iVar) {
        this.a = iVar;
    }

    private static WebResourceResponse g() {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.E.g()).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01fa, code lost:
    
        com.google.android.gms.ads.internal.c.e();
        com.google.android.gms.ads.internal.c.e();
        r0 = r4.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0208, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x020a, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x020c, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
    
        com.google.android.gms.ads.internal.c.e();
        r0 = r4.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0226, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0228, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x022a, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0266, code lost:
    
        r0 = r4.getHeaderFields();
        r13 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027f, code lost:
    
        if (r0.hasNext() == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0281, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x028b, code lost:
    
        if (r2.getKey() == null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0291, code lost:
    
        if (r2.getValue() == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x029d, code lost:
    
        if (r2.getValue().isEmpty() != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x029f, code lost:
    
        r13.put(r2.getKey(), r2.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b5, code lost:
    
        r6 = com.google.android.gms.ads.internal.c.f().a(r9, r10, r4.getResponseCode(), r4.getResponseMessage(), r13, r4.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022c, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0233, code lost:
    
        if (r0.length != 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0235, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0238, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023a, code lost:
    
        if (r2 >= r0.length) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0248, code lost:
    
        if (r0[r2].trim().startsWith("charset") == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024a, code lost:
    
        r3 = r0[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0257, code lost:
    
        if (r3.length <= 1) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0259, code lost:
    
        r0 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0260, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0263, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020e, code lost:
    
        r0 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e5 A[Catch: NoClassDefFoundError -> 0x05c7, Exception | NoClassDefFoundError -> 0x05c9, TRY_LEAVE, TryCatch #18 {Exception | NoClassDefFoundError -> 0x05c9, blocks: (B:3:0x0004, B:7:0x0116, B:9:0x011e, B:38:0x02c9, B:103:0x02d5, B:104:0x02df, B:106:0x02e1, B:107:0x02e4, B:108:0x02e5, B:111:0x02ea, B:115:0x039a, B:117:0x03b7, B:119:0x03cd, B:121:0x03e4, B:122:0x03e7, B:123:0x03ea, B:125:0x03f8, B:127:0x0411, B:128:0x0422, B:129:0x044b, B:140:0x04ab, B:141:0x04bb, B:144:0x05b2, B:156:0x04f9, B:168:0x053d, B:169:0x054f, B:163:0x052c, B:186:0x0552, B:187:0x041a, B:188:0x0553, B:189:0x0559, B:193:0x0560, B:195:0x0566, B:197:0x05a0, B:202:0x05c2, B:204:0x05c3, B:206:0x02fb, B:208:0x0305, B:209:0x0311, B:213:0x0346, B:214:0x0353, B:216:0x0359, B:219:0x0361, B:222:0x0369, B:227:0x038f, B:230:0x0376, B:232:0x0341, B:235:0x001f, B:237:0x0029, B:240:0x0031, B:245:0x004e, B:247:0x0064, B:249:0x006a, B:251:0x0074, B:252:0x008d, B:254:0x0097, B:255:0x00af, B:257:0x00b7, B:259:0x00c5, B:261:0x00cf, B:262:0x00ed, B:264:0x00f7, B:265:0x003d, B:268:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039a A[Catch: NoClassDefFoundError -> 0x05c7, Exception | NoClassDefFoundError -> 0x05c9, TryCatch #18 {Exception | NoClassDefFoundError -> 0x05c9, blocks: (B:3:0x0004, B:7:0x0116, B:9:0x011e, B:38:0x02c9, B:103:0x02d5, B:104:0x02df, B:106:0x02e1, B:107:0x02e4, B:108:0x02e5, B:111:0x02ea, B:115:0x039a, B:117:0x03b7, B:119:0x03cd, B:121:0x03e4, B:122:0x03e7, B:123:0x03ea, B:125:0x03f8, B:127:0x0411, B:128:0x0422, B:129:0x044b, B:140:0x04ab, B:141:0x04bb, B:144:0x05b2, B:156:0x04f9, B:168:0x053d, B:169:0x054f, B:163:0x052c, B:186:0x0552, B:187:0x041a, B:188:0x0553, B:189:0x0559, B:193:0x0560, B:195:0x0566, B:197:0x05a0, B:202:0x05c2, B:204:0x05c3, B:206:0x02fb, B:208:0x0305, B:209:0x0311, B:213:0x0346, B:214:0x0353, B:216:0x0359, B:219:0x0361, B:222:0x0369, B:227:0x038f, B:230:0x0376, B:232:0x0341, B:235:0x001f, B:237:0x0029, B:240:0x0031, B:245:0x004e, B:247:0x0064, B:249:0x006a, B:251:0x0074, B:252:0x008d, B:254:0x0097, B:255:0x00af, B:257:0x00b7, B:259:0x00c5, B:261:0x00cf, B:262:0x00ed, B:264:0x00f7, B:265:0x003d, B:268:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f8 A[Catch: NoClassDefFoundError -> 0x05c7, Exception | NoClassDefFoundError -> 0x05c9, TryCatch #18 {Exception | NoClassDefFoundError -> 0x05c9, blocks: (B:3:0x0004, B:7:0x0116, B:9:0x011e, B:38:0x02c9, B:103:0x02d5, B:104:0x02df, B:106:0x02e1, B:107:0x02e4, B:108:0x02e5, B:111:0x02ea, B:115:0x039a, B:117:0x03b7, B:119:0x03cd, B:121:0x03e4, B:122:0x03e7, B:123:0x03ea, B:125:0x03f8, B:127:0x0411, B:128:0x0422, B:129:0x044b, B:140:0x04ab, B:141:0x04bb, B:144:0x05b2, B:156:0x04f9, B:168:0x053d, B:169:0x054f, B:163:0x052c, B:186:0x0552, B:187:0x041a, B:188:0x0553, B:189:0x0559, B:193:0x0560, B:195:0x0566, B:197:0x05a0, B:202:0x05c2, B:204:0x05c3, B:206:0x02fb, B:208:0x0305, B:209:0x0311, B:213:0x0346, B:214:0x0353, B:216:0x0359, B:219:0x0361, B:222:0x0369, B:227:0x038f, B:230:0x0376, B:232:0x0341, B:235:0x001f, B:237:0x0029, B:240:0x0031, B:245:0x004e, B:247:0x0064, B:249:0x006a, B:251:0x0074, B:252:0x008d, B:254:0x0097, B:255:0x00af, B:257:0x00b7, B:259:0x00c5, B:261:0x00cf, B:262:0x00ed, B:264:0x00f7, B:265:0x003d, B:268:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05b2 A[Catch: NoClassDefFoundError -> 0x05c7, Exception | NoClassDefFoundError -> 0x05c9, TRY_LEAVE, TryCatch #18 {Exception | NoClassDefFoundError -> 0x05c9, blocks: (B:3:0x0004, B:7:0x0116, B:9:0x011e, B:38:0x02c9, B:103:0x02d5, B:104:0x02df, B:106:0x02e1, B:107:0x02e4, B:108:0x02e5, B:111:0x02ea, B:115:0x039a, B:117:0x03b7, B:119:0x03cd, B:121:0x03e4, B:122:0x03e7, B:123:0x03ea, B:125:0x03f8, B:127:0x0411, B:128:0x0422, B:129:0x044b, B:140:0x04ab, B:141:0x04bb, B:144:0x05b2, B:156:0x04f9, B:168:0x053d, B:169:0x054f, B:163:0x052c, B:186:0x0552, B:187:0x041a, B:188:0x0553, B:189:0x0559, B:193:0x0560, B:195:0x0566, B:197:0x05a0, B:202:0x05c2, B:204:0x05c3, B:206:0x02fb, B:208:0x0305, B:209:0x0311, B:213:0x0346, B:214:0x0353, B:216:0x0359, B:219:0x0361, B:222:0x0369, B:227:0x038f, B:230:0x0376, B:232:0x0341, B:235:0x001f, B:237:0x0029, B:240:0x0031, B:245:0x004e, B:247:0x0064, B:249:0x006a, B:251:0x0074, B:252:0x008d, B:254:0x0097, B:255:0x00af, B:257:0x00b7, B:259:0x00c5, B:261:0x00cf, B:262:0x00ed, B:264:0x00f7, B:265:0x003d, B:268:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x051f A[Catch: all -> 0x0509, TryCatch #9 {all -> 0x0509, blocks: (B:152:0x04d7, B:154:0x04e5, B:155:0x04ee, B:159:0x0511, B:161:0x051f, B:162:0x0528), top: B:132:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0553 A[Catch: NoClassDefFoundError -> 0x05c7, Exception | NoClassDefFoundError -> 0x05c9, TryCatch #18 {Exception | NoClassDefFoundError -> 0x05c9, blocks: (B:3:0x0004, B:7:0x0116, B:9:0x011e, B:38:0x02c9, B:103:0x02d5, B:104:0x02df, B:106:0x02e1, B:107:0x02e4, B:108:0x02e5, B:111:0x02ea, B:115:0x039a, B:117:0x03b7, B:119:0x03cd, B:121:0x03e4, B:122:0x03e7, B:123:0x03ea, B:125:0x03f8, B:127:0x0411, B:128:0x0422, B:129:0x044b, B:140:0x04ab, B:141:0x04bb, B:144:0x05b2, B:156:0x04f9, B:168:0x053d, B:169:0x054f, B:163:0x052c, B:186:0x0552, B:187:0x041a, B:188:0x0553, B:189:0x0559, B:193:0x0560, B:195:0x0566, B:197:0x05a0, B:202:0x05c2, B:204:0x05c3, B:206:0x02fb, B:208:0x0305, B:209:0x0311, B:213:0x0346, B:214:0x0353, B:216:0x0359, B:219:0x0361, B:222:0x0369, B:227:0x038f, B:230:0x0376, B:232:0x0341, B:235:0x001f, B:237:0x0029, B:240:0x0031, B:245:0x004e, B:247:0x0064, B:249:0x006a, B:251:0x0074, B:252:0x008d, B:254:0x0097, B:255:0x00af, B:257:0x00b7, B:259:0x00c5, B:261:0x00cf, B:262:0x00ed, B:264:0x00f7, B:265:0x003d, B:268:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x004e A[Catch: NoClassDefFoundError -> 0x05c7, Exception | NoClassDefFoundError -> 0x05c9, TryCatch #18 {Exception | NoClassDefFoundError -> 0x05c9, blocks: (B:3:0x0004, B:7:0x0116, B:9:0x011e, B:38:0x02c9, B:103:0x02d5, B:104:0x02df, B:106:0x02e1, B:107:0x02e4, B:108:0x02e5, B:111:0x02ea, B:115:0x039a, B:117:0x03b7, B:119:0x03cd, B:121:0x03e4, B:122:0x03e7, B:123:0x03ea, B:125:0x03f8, B:127:0x0411, B:128:0x0422, B:129:0x044b, B:140:0x04ab, B:141:0x04bb, B:144:0x05b2, B:156:0x04f9, B:168:0x053d, B:169:0x054f, B:163:0x052c, B:186:0x0552, B:187:0x041a, B:188:0x0553, B:189:0x0559, B:193:0x0560, B:195:0x0566, B:197:0x05a0, B:202:0x05c2, B:204:0x05c3, B:206:0x02fb, B:208:0x0305, B:209:0x0311, B:213:0x0346, B:214:0x0353, B:216:0x0359, B:219:0x0361, B:222:0x0369, B:227:0x038f, B:230:0x0376, B:232:0x0341, B:235:0x001f, B:237:0x0029, B:240:0x0031, B:245:0x004e, B:247:0x0064, B:249:0x006a, B:251:0x0074, B:252:0x008d, B:254:0x0097, B:255:0x00af, B:257:0x00b7, B:259:0x00c5, B:261:0x00cf, B:262:0x00ed, B:264:0x00f7, B:265:0x003d, B:268:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x011e A[Catch: NoClassDefFoundError -> 0x05c7, Exception | NoClassDefFoundError -> 0x05c9, TRY_LEAVE, TryCatch #18 {Exception | NoClassDefFoundError -> 0x05c9, blocks: (B:3:0x0004, B:7:0x0116, B:9:0x011e, B:38:0x02c9, B:103:0x02d5, B:104:0x02df, B:106:0x02e1, B:107:0x02e4, B:108:0x02e5, B:111:0x02ea, B:115:0x039a, B:117:0x03b7, B:119:0x03cd, B:121:0x03e4, B:122:0x03e7, B:123:0x03ea, B:125:0x03f8, B:127:0x0411, B:128:0x0422, B:129:0x044b, B:140:0x04ab, B:141:0x04bb, B:144:0x05b2, B:156:0x04f9, B:168:0x053d, B:169:0x054f, B:163:0x052c, B:186:0x0552, B:187:0x041a, B:188:0x0553, B:189:0x0559, B:193:0x0560, B:195:0x0566, B:197:0x05a0, B:202:0x05c2, B:204:0x05c3, B:206:0x02fb, B:208:0x0305, B:209:0x0311, B:213:0x0346, B:214:0x0353, B:216:0x0359, B:219:0x0361, B:222:0x0369, B:227:0x038f, B:230:0x0376, B:232:0x0341, B:235:0x001f, B:237:0x0029, B:240:0x0031, B:245:0x004e, B:247:0x0064, B:249:0x006a, B:251:0x0074, B:252:0x008d, B:254:0x0097, B:255:0x00af, B:257:0x00b7, B:259:0x00c5, B:261:0x00cf, B:262:0x00ed, B:264:0x00f7, B:265:0x003d, B:268:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v2, types: [android.webkit.WebResourceResponse, java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r5v21, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.webkit.WebResourceResponse b(java.lang.String r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.webview.n.b(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void c() {
        synchronized (this.c) {
            this.b.clear();
            this.e = null;
            this.d = false;
        }
    }

    public final void d(final Uri uri) {
        String.valueOf(uri);
        HashMap hashMap = this.b;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            String.valueOf(uri);
            if (!((Boolean) com.google.android.gms.ads.internal.config.p.aR.g()).booleanValue() || com.google.android.gms.ads.internal.c.d().a() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            com.google.android.gms.ads.internal.util.future.e.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.webview.k
                @Override // java.lang.Runnable
                public final void run() {
                    int i = n.f;
                    com.google.android.gms.ads.internal.csi.b a = com.google.android.gms.ads.internal.c.d().a();
                    HashSet hashSet = a.g;
                    String str = substring;
                    if (hashSet.contains(str)) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sdkVersion", a.f);
                    linkedHashMap.put("ue", str);
                    a.b(a.a(a.b, linkedHashMap), null);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.config.p.aG.g()).booleanValue() && this.g.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.config.p.aI.g()).intValue()) {
                eqgc.t(eqgc.m(new Callable() { // from class: com.google.android.gms.ads.internal.util.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        caqj caqjVar = m.a;
                        com.google.android.gms.ads.internal.c.e();
                        return m.n(uri);
                    }
                }, com.google.android.gms.ads.internal.c.e().c), new m(this, list, uri), com.google.android.gms.ads.internal.util.future.e.c);
                return;
            }
        }
        com.google.android.gms.ads.internal.c.e();
        e(com.google.android.gms.ads.internal.util.m.n(uri), list);
    }

    public final void e(Map map, List list) {
        if (com.google.android.gms.ads.internal.util.c.a()) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((com.google.android.gms.ads.internal.gmsg.e) it2.next()).a(this.a, map);
        }
    }

    public final void f() {
        synchronized (this.c) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            d(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.c) {
            i iVar = this.a;
            if (iVar.l()) {
                com.google.android.gms.ads.internal.video.b bVar = ((r) iVar).b;
                atzb.h("onDestroy must be called from the UI thread.");
                com.google.android.gms.ads.internal.video.a aVar = bVar.a;
                ((r) iVar).a.k();
                return;
            }
            com.google.android.gms.ads.internal.js.f fVar = this.e;
            if (fVar != null) {
                com.google.android.gms.ads.internal.c.j();
                com.google.android.gms.ads.internal.js.n nVar = fVar.a;
                long currentTimeMillis = System.currentTimeMillis() - nVar.c;
                final ArrayList arrayList = nVar.b;
                arrayList.add(Long.valueOf(currentTimeMillis));
                String.valueOf(arrayList.get(0));
                caqj caqjVar = com.google.android.gms.ads.internal.util.m.a;
                final ah ahVar = nVar.a;
                final ag agVar = nVar.d;
                final com.google.android.gms.ads.internal.js.k kVar = nVar.e;
                caqjVar.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.js.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ag agVar2 = agVar;
                        final k kVar2 = kVar;
                        ArrayList arrayList2 = arrayList;
                        synchronized (ah.this.a) {
                            if (agVar2.e() != -1 && agVar2.e() != 1) {
                                if (((Boolean) com.google.android.gms.ads.internal.config.p.aZ.g()).booleanValue()) {
                                    agVar2.g(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                                } else {
                                    agVar2.f();
                                }
                                eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.c;
                                Objects.requireNonNull(kVar2);
                                eqgoVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.js.m
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        k.this.d();
                                    }
                                });
                                String.valueOf(com.google.android.gms.ads.internal.config.p.c.g());
                                agVar2.e();
                                String.valueOf(arrayList2.get(0));
                                com.google.android.gms.ads.internal.c.j();
                                System.currentTimeMillis();
                            }
                        }
                    }
                }, ((Integer) com.google.android.gms.ads.internal.config.p.c.g()).intValue());
                this.e = null;
            }
            i iVar2 = this.a;
            x xVar = (x) ((r) iVar2).a;
            if (xVar.d == null) {
                com.google.android.gms.ads.internal.csi.k kVar2 = xVar.e.b;
                xVar.d = com.google.android.gms.ads.internal.csi.k.a();
                xVar.e.a("native:view_load", xVar.d);
            }
            iVar2.n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        final boolean didCrash;
        final int rendererPriorityAtExit;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        r rVar = (r) this.a;
        if (!rVar.c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.config.p.G.g()).booleanValue()) {
            return false;
        }
        i iVar = rVar.a;
        if (iVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) iVar.getParent()).removeView((View) iVar);
        }
        x xVar = (x) iVar;
        xVar.destroy();
        com.google.android.gms.ads.internal.clearcut.b bVar = xVar.g;
        bVar.a(new com.google.android.gms.ads.internal.clearcut.a() { // from class: com.google.android.gms.ads.internal.webview.u
            @Override // com.google.android.gms.ads.internal.clearcut.a
            public final void a(fgrc fgrcVar) {
                int i = x.h;
                fgrc v = com.google.android.gms.ads.internal.clearcut.j.a.v();
                fgri fgriVar = v.b;
                boolean z = ((com.google.android.gms.ads.internal.clearcut.j) fgriVar).c;
                boolean z2 = didCrash;
                if (z != z2) {
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    com.google.android.gms.ads.internal.clearcut.j jVar = (com.google.android.gms.ads.internal.clearcut.j) v.b;
                    jVar.b |= 1;
                    jVar.c = z2;
                }
                if (!v.b.L()) {
                    v.U();
                }
                int i2 = rendererPriorityAtExit;
                com.google.android.gms.ads.internal.clearcut.j jVar2 = (com.google.android.gms.ads.internal.clearcut.j) v.b;
                jVar2.b |= 2;
                jVar2.d = i2;
                com.google.android.gms.ads.internal.clearcut.j jVar3 = (com.google.android.gms.ads.internal.clearcut.j) v.Q();
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                com.google.android.gms.ads.internal.clearcut.i iVar2 = (com.google.android.gms.ads.internal.clearcut.i) fgrcVar.b;
                com.google.android.gms.ads.internal.clearcut.i iVar3 = com.google.android.gms.ads.internal.clearcut.i.a;
                jVar3.getClass();
                iVar2.e = jVar3;
                iVar2.b |= 1024;
            }
        });
        bVar.b(10003);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return b(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            d(parse);
        } else if (((WebView) ((r) this.a).a).willNotDraw()) {
            com.google.android.gms.ads.internal.util.client.h.k("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
        } else {
            try {
                ((Boolean) com.google.android.gms.ads.internal.config.p.bU.g()).booleanValue();
            } catch (qmk unused) {
                com.google.android.gms.ads.internal.util.client.h.k("Unable to append parameter to URL: ".concat(String.valueOf(str)));
            }
            AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = new AdLauncherIntentInfoParcel("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null, new ObjectWrapper(null), false);
            i iVar = this.a;
            if (iVar != null) {
                iVar.c();
                str2 = null;
            } else {
                str2 = "";
            }
            iVar.q();
            AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(adLauncherIntentInfoParcel, iVar.i(), iVar, str2);
            com.google.android.gms.ads.internal.c cVar = com.google.android.gms.ads.internal.c.a;
            com.google.android.gms.ads.internal.overlay.c cVar2 = cVar.c;
            int i = adOverlayInfoParcel.l;
            Context context = iVar.getContext();
            if (i == 4 && adOverlayInfoParcel.d == null) {
                com.google.android.gms.ads.internal.client.a aVar = adOverlayInfoParcel.c;
                if (aVar != null) {
                    aVar.a();
                }
                i iVar2 = adOverlayInfoParcel.e;
                AdLauncherIntentInfoParcel adLauncherIntentInfoParcel2 = adOverlayInfoParcel.b;
                Activity f2 = iVar2.f();
                if (adLauncherIntentInfoParcel2 != null && adLauncherIntentInfoParcel2.j && f2 != null) {
                    context = f2;
                }
                com.google.android.gms.ads.internal.overlay.a aVar2 = cVar.b;
                com.google.android.gms.ads.internal.overlay.i iVar3 = adOverlayInfoParcel.j;
                com.google.android.gms.ads.internal.overlay.h hVar = adLauncherIntentInfoParcel2 != null ? adLauncherIntentInfoParcel2.i : null;
                if (adLauncherIntentInfoParcel2 == null) {
                    int i2 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.k("No intent data for launcher overlay.");
                } else {
                    com.google.android.gms.ads.internal.config.p.c(context);
                    Intent intent = adLauncherIntentInfoParcel2.h;
                    if (intent != null) {
                        com.google.android.gms.ads.internal.overlay.a.a(context, intent, iVar3, hVar, adLauncherIntentInfoParcel2.j);
                    } else {
                        Intent intent2 = new Intent();
                        String str3 = adLauncherIntentInfoParcel2.b;
                        if (TextUtils.isEmpty(str3)) {
                            int i3 = com.google.android.gms.ads.internal.util.c.a;
                            com.google.android.gms.ads.internal.util.client.h.k("Open GMSG did not contain a URL.");
                        } else {
                            String str4 = adLauncherIntentInfoParcel2.c;
                            if (TextUtils.isEmpty(str4)) {
                                intent2.setData(Uri.parse(str3));
                            } else {
                                intent2.setDataAndType(Uri.parse(str3), str4);
                            }
                            intent2.setAction("android.intent.action.VIEW");
                            String str5 = adLauncherIntentInfoParcel2.d;
                            if (!TextUtils.isEmpty(str5)) {
                                intent2.setPackage(str5);
                            }
                            String str6 = adLauncherIntentInfoParcel2.e;
                            int i4 = 0;
                            if (!TextUtils.isEmpty(str6)) {
                                String[] split = str6.split("/", 2);
                                if (split.length < 2) {
                                    String valueOf = String.valueOf(str6);
                                    int i5 = com.google.android.gms.ads.internal.util.c.a;
                                    com.google.android.gms.ads.internal.util.client.h.k("Could not parse component name from open GMSG: ".concat(valueOf));
                                } else {
                                    intent2.setClassName(split[0], split[1]);
                                }
                            }
                            String str7 = adLauncherIntentInfoParcel2.f;
                            if (!TextUtils.isEmpty(str7)) {
                                try {
                                    i4 = Integer.parseInt(str7);
                                } catch (NumberFormatException unused2) {
                                    int i6 = com.google.android.gms.ads.internal.util.c.a;
                                    com.google.android.gms.ads.internal.util.client.h.k("Could not parse intent flags.");
                                }
                                intent2.addFlags(i4);
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.config.p.aw.g()).booleanValue()) {
                                intent2.addFlags(268435456);
                                intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                            } else if (((Boolean) com.google.android.gms.ads.internal.config.p.av.g()).booleanValue()) {
                                com.google.android.gms.ads.internal.c.e();
                                Bundle extras = intent2.getExtras() != null ? intent2.getExtras() : new Bundle();
                                extras.putBinder("android.support.customtabs.extra.SESSION", null);
                                extras.putString("com.android.browser.application_id", context.getPackageName());
                                intent2.putExtras(extras);
                            }
                            com.google.android.gms.ads.internal.overlay.a.a(context, intent2, iVar3, hVar, adLauncherIntentInfoParcel2.j);
                        }
                    }
                }
            } else {
                Intent intent3 = new Intent();
                intent3.setClassName(context, "com.google.android.gms.ads.AdActivity");
                intent3.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.n.d);
                intent3.putExtra("shouldCallOnOverlayOpened", true);
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
                intent3.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
                if (!(context instanceof Activity)) {
                    intent3.addFlags(268435456);
                }
                if (((Boolean) com.google.android.gms.ads.internal.config.p.ca.g()).booleanValue()) {
                    com.google.android.gms.ads.internal.c.e();
                    com.google.android.gms.ads.internal.util.m.t(context, intent3);
                } else {
                    com.google.android.gms.ads.internal.c.e();
                    com.google.android.gms.ads.internal.util.m.s(context, intent3);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void a() {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }
}
