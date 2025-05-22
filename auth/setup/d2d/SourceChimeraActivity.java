package com.google.android.gms.auth.setup.d2d;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.acpt;
import defpackage.afcv;
import defpackage.afcw;
import defpackage.afcy;
import defpackage.afcz;
import defpackage.afda;
import defpackage.afdb;
import defpackage.afdc;
import defpackage.afdd;
import defpackage.afdg;
import defpackage.afdl;
import defpackage.afdm;
import defpackage.afdn;
import defpackage.afdo;
import defpackage.asxd;
import defpackage.atag;
import defpackage.atnq;
import defpackage.auad;
import defpackage.auqx;
import defpackage.bsup;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.eqhc;
import defpackage.fgpr;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgsd;
import defpackage.ind;
import defpackage.ryr;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SourceChimeraActivity extends ryr implements atag {
    public static final auad h = new auad("D2D", "SourceActivity");
    private static final long z = TimeUnit.MINUTES.toMillis(5);
    public Account[] i;
    public BluetoothAdapter j;
    public afdn r;
    public AlertDialog t;
    public afdm u;
    public afdl v;
    public acpt w;
    public AsyncTask x;
    public afcv y;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public volatile boolean n = false;
    public boolean o = false;
    public final Object p = new Object();
    public boolean q = false;
    public final eqhc s = new eqhc();

    public SourceChimeraActivity() {
        auad auadVar = afcw.a;
    }

    public static Object b(dhlw dhlwVar) {
        dhmr.o(dhlwVar, z, TimeUnit.MILLISECONDS);
        return dhlwVar.i();
    }

    private final void n(AlertDialog alertDialog) {
        AlertDialog alertDialog2 = this.t;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.t.dismiss();
        }
        this.t = alertDialog;
        alertDialog.getWindow().addFlags(128);
        this.t.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0153 A[Catch: all -> 0x0138, TryCatch #6 {all -> 0x0138, blocks: (B:94:0x00a7, B:97:0x00d3, B:100:0x00ed, B:102:0x00f5, B:103:0x00f8, B:106:0x00fc, B:109:0x0101, B:112:0x0113, B:114:0x0119, B:115:0x011c, B:119:0x010f, B:121:0x0142, B:123:0x0153, B:124:0x0156, B:126:0x0169, B:127:0x016c, B:135:0x00e3, B:136:0x00c1, B:138:0x00cb, B:139:0x00ce), top: B:93:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0169 A[Catch: all -> 0x0138, TryCatch #6 {all -> 0x0138, blocks: (B:94:0x00a7, B:97:0x00d3, B:100:0x00ed, B:102:0x00f5, B:103:0x00f8, B:106:0x00fc, B:109:0x0101, B:112:0x0113, B:114:0x0119, B:115:0x011c, B:119:0x010f, B:121:0x0142, B:123:0x0153, B:124:0x0156, B:126:0x0169, B:127:0x016c, B:135:0x00e3, B:136:0x00c1, B:138:0x00cb, B:139:0x00ce), top: B:93:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0186 A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01be A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01da A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f6 A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020f A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x022c A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0245 A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b8 A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02eb A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cd A[Catch: TimeoutException -> 0x043b, ExecutionException -> 0x043d, InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, NoSuchAlgorithmException -> 0x0441, JSONException -> 0x0443, TryCatch #6 {InterruptedException | NoSuchAlgorithmException | ExecutionException | TimeoutException | JSONException -> 0x043f, blocks: (B:5:0x0010, B:8:0x0025, B:10:0x002d, B:11:0x0030, B:13:0x0045, B:14:0x0048, B:16:0x005c, B:17:0x005f, B:19:0x0071, B:21:0x0077, B:22:0x007a, B:24:0x008d, B:25:0x0090, B:26:0x017d, B:28:0x0186, B:29:0x01a8, B:31:0x01be, B:32:0x01c1, B:34:0x01da, B:35:0x01dd, B:37:0x01f6, B:38:0x01f9, B:40:0x020f, B:41:0x0212, B:43:0x022c, B:44:0x022f, B:46:0x0245, B:47:0x0248, B:49:0x02b8, B:52:0x02eb, B:54:0x02fd, B:55:0x0300, B:57:0x0318, B:58:0x031b, B:60:0x032e, B:61:0x0331, B:63:0x035b, B:64:0x035e, B:66:0x0367, B:68:0x0375, B:69:0x0378, B:88:0x0431, B:89:0x02cd, B:91:0x02d5, B:92:0x00a2, B:116:0x0128, B:117:0x012c, B:128:0x0178, B:141:0x0433, B:142:0x043a), top: B:4:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.etsy a(defpackage.ettd r24, defpackage.xgz r25, defpackage.xha r26) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.setup.d2d.SourceChimeraActivity.a(ettd, xgz, xha):etsy");
    }

    public final void c() {
        this.k = true;
        if (this.j.enable()) {
            ind.b(this, new TracingBroadcastReceiver() { // from class: com.google.android.gms.auth.setup.d2d.SourceChimeraActivity.6
                @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                public final void jP(Context context, Intent intent) {
                    SourceChimeraActivity sourceChimeraActivity = SourceChimeraActivity.this;
                    if (sourceChimeraActivity.j.isEnabled()) {
                        context.unregisterReceiver(this);
                        sourceChimeraActivity.m();
                    }
                }
            }, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
        } else {
            h.f("Could not enable Bluetooth.", new Object[0]);
            finish();
        }
    }

    public final void j(int i) {
        k();
        runOnUiThread(new afcy(this, i));
    }

    public final void k() {
        this.n = true;
        if (this.y != null) {
            fgrc v = afdo.a.v();
            if (!v.b.L()) {
                v.U();
            }
            afdo.b((afdo) v.b);
            if (!v.b.L()) {
                v.U();
            }
            afdo afdoVar = (afdo) v.b;
            afdoVar.b |= 4;
            afdoVar.d = true;
            try {
                this.y.a((afdo) v.Q());
            } catch (IOException e) {
                h.l(e);
            }
        }
        finish();
    }

    public final void l() {
        String string = getString(R.string.auth_d2d_source_copy_notice);
        if (!this.l) {
            if (this.j.isEnabled()) {
                string = string + " " + getString(R.string.auth_d2d_source_no_lock_bt_on_notice);
            } else {
                string = string + " " + getString(R.string.auth_d2d_source_no_lock_bt_off_notice);
            }
        }
        if (this.m && !this.j.isEnabled()) {
            c();
        }
        n(new AlertDialog.Builder(this).setTitle(R.string.auth_d2d_tap_and_go).setMessage(string).setCancelable(false).setPositiveButton(android.R.string.ok, new afdb(this)).setNegativeButton(android.R.string.cancel, new afda()).setOnCancelListener(new afcz(this)).create());
    }

    public final void m() {
        afdm afdmVar = new afdm(this, this.j, UUID.fromString(this.r.c), this.r.d);
        this.u = afdmVar;
        afdmVar.start();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1) {
                k();
            } else {
                this.m = true;
                l();
            }
        }
    }

    @Override // defpackage.ateu
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        if (this.o) {
            return;
        }
        this.o = true;
        int i = connectionResult.c;
        afdg afdgVar = new afdg();
        Bundle bundle = new Bundle();
        bundle.putInt("error_dialog_code", i);
        afdgVar.setArguments(bundle);
        afdgVar.show(getContainerActivity().getFragmentManager(), "error_dialog");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        int i = auqx.a;
        boolean z2 = false;
        if (asxd.g(this)) {
            j(R.string.auth_d2d_source_restricted_user_toast);
            h.m("Cannot clone restricted profile", new Object[0]);
            return;
        }
        Account[] p = bsup.b(this).p("com.google");
        this.i = p;
        if (p.length <= 0) {
            j(R.string.auth_d2d_source_no_accounts_toast);
            h.j("No accounts found!", new Object[0]);
            return;
        }
        BluetoothAdapter a = atnq.a(this);
        this.j = a;
        if (a == null) {
            j(R.string.auth_d2d_source_no_bluetooth_toast);
            h.h("Bluetooth not available.", new Object[0]);
            return;
        }
        setContentView(new View(this));
        getWindow().addFlags(128);
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (keyguardManager != null && keyguardManager.isKeyguardSecure()) {
            this.l = true;
        }
        Intent intent = getIntent();
        fgrc v = afdn.a.v();
        byte[] byteArrayExtra = intent.getByteArrayExtra("payload");
        afdn afdnVar = null;
        if (byteArrayExtra != null) {
            try {
                afdnVar = (afdn) ((fgrc) v.D(byteArrayExtra, fgqp.a())).Q();
            } catch (fgsd e) {
                h.g("Could not deserialize BootstrapInfo!", e, new Object[0]);
            }
        } else {
            String stringExtra = intent.getStringExtra("btMacAddress");
            if (!v.b.L()) {
                v.U();
            }
            afdn afdnVar2 = (afdn) v.b;
            stringExtra.getClass();
            afdnVar2.b |= 2;
            afdnVar2.d = stringExtra;
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("initiatorHello");
            if (byteArrayExtra2 != null) {
                fgpr w = fgpr.w(byteArrayExtra2);
                if (!v.b.L()) {
                    v.U();
                }
                afdn afdnVar3 = (afdn) v.b;
                afdnVar3.b |= 4;
                afdnVar3.e = w;
            }
            if (((afdn) v.b).d.isEmpty()) {
                h.f("Bluetooth MAC address information missing.", new Object[0]);
            } else {
                afdnVar = (afdn) v.Q();
            }
        }
        this.r = afdnVar;
        if (afdnVar != null) {
            boolean isEnabled = this.j.isEnabled();
            if (isEnabled) {
                m();
            }
            if (this.l) {
                String string = getString(R.string.auth_d2d_source_lock_notice);
                if (isEnabled) {
                    str = string + "\n" + getString(R.string.auth_d2d_source_lock_bt_on_notice);
                } else {
                    str = string + "\n" + getString(R.string.auth_d2d_source_lock_bt_off_notice);
                }
                n(new AlertDialog.Builder(this).setTitle(R.string.auth_d2d_tap_and_go).setMessage(str).setPositiveButton(R.string.auth_d2d_source_alert_verify_lock_button, new afdd(this)).setOnCancelListener(new afdc(this)).setCancelable(true).create());
            } else {
                l();
            }
        } else {
            finish();
        }
        if (bundle != null && bundle.getBoolean("resolving_error", false)) {
            z2 = true;
        }
        this.o = z2;
        this.w = new acpt(this);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        AlertDialog alertDialog = this.t;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.t.dismiss();
            this.t = null;
        }
        afcv afcvVar = this.y;
        if (afcvVar != null) {
            try {
                afcvVar.b();
            } catch (IOException e) {
                h.l(e);
            }
        }
        afdm afdmVar = this.u;
        if (afdmVar != null) {
            afdmVar.a();
        }
        if (this.k) {
            this.j.disable();
        }
        super.onDestroy();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        AsyncTask asyncTask = this.x;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.x = null;
        }
        synchronized (this.p) {
            if (!this.q) {
                k();
            }
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        synchronized (this.p) {
            this.q = false;
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.o);
    }
}
