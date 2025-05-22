package com.google.android.gms.nearby.fastpair.sass.device.connection.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SassProcessChimeraActivity;
import defpackage.caqj;
import defpackage.chke;
import defpackage.ckpb;
import defpackage.ckuy;
import defpackage.ekxj;
import defpackage.eluo;
import defpackage.ftes;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SassProcessChimeraActivity extends ryt {
    private BroadcastReceiver j;
    private AudioManager k;
    private final Handler l = new caqj(Looper.getMainLooper());
    private AudioDeviceCallback m;

    public static final void b(Context context) {
        ((eluo) ckpb.a.d().ai(7212)).x("SassProcessChimeraActivity: Call bt settings.");
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        intent.putExtra("EXTRA_CONNECTION_ONLY", true);
        intent.putExtra("EXTRA_CLOSE_ON_CONNECT", true);
        intent.putExtra("EXTRA_IGNORE_SASS", true);
        intent.putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
        intent.addFlags(268468224);
        context.startActivity(intent);
    }

    private final AudioManager c() {
        if (this.k == null) {
            this.k = (AudioManager) getSystemService(AudioManager.class);
        }
        return this.k;
    }

    public final boolean a() {
        if (!getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : c().getDevices(2)) {
            if (audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (a()) {
            ((eluo) ckpb.a.d().ai(7214)).x("SassProcessChimeraActivity: Bt headset connected already. Finish activity.");
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        AudioDeviceAttributes mutingExpectedDevice = c().getMutingExpectedDevice();
        if (mutingExpectedDevice == null) {
            b(this);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        chke.d(this, new Intent("com.google.android.gms.nearby.fastpair.sass.device.ACTION_CONNECTING_UI_LAUNCHING"));
        setContentView(R.layout.fast_pair_sass_connecting);
        ((TextView) findViewById(R.id.text_subtitle)).setText(mutingExpectedDevice.getName());
        this.m = new ckuy(this);
        AudioManager c = c();
        AudioDeviceCallback audioDeviceCallback = this.m;
        ekxj.e(audioDeviceCallback);
        c.registerAudioDeviceCallback(audioDeviceCallback, null);
        this.l.postDelayed(new Runnable() { // from class: ckux
            @Override // java.lang.Runnable
            public final void run() {
                SassProcessChimeraActivity sassProcessChimeraActivity = SassProcessChimeraActivity.this;
                if (sassProcessChimeraActivity.isFinishing()) {
                    return;
                }
                ((eluo) ckpb.a.d().ai(7213)).x("SassProcessChimeraActivity: Timeout. Finish activity.");
                if (!sassProcessChimeraActivity.a()) {
                    SassProcessChimeraActivity.b(sassProcessChimeraActivity);
                }
                sassProcessChimeraActivity.finish();
            }
        }, ftes.a.lK().es());
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SassProcessChimeraActivity.2
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent) {
                if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                    return;
                }
                ((eluo) ckpb.a.d().ai(7211)).Q("SassProcessChimeraActivity: Received action=%s, call_settings=%s", intent.getAction(), intent.getBooleanExtra("call_settings", false));
                if (intent.getBooleanExtra("call_settings", false)) {
                    SassProcessChimeraActivity.b(context);
                }
                SassProcessChimeraActivity sassProcessChimeraActivity = SassProcessChimeraActivity.this;
                if (sassProcessChimeraActivity.isFinishing()) {
                    return;
                }
                sassProcessChimeraActivity.finish();
            }
        };
        this.j = tracingBroadcastReceiver;
        chke.b(this, tracingBroadcastReceiver, new IntentFilter("com.google.android.gms.nearby.fastpair.sass.device.ACTION_WEAR_OS_CONNECTING_UI_DISMISS"));
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            chke.f(this, broadcastReceiver);
        }
        if (this.m != null) {
            AudioManager c = c();
            AudioDeviceCallback audioDeviceCallback = this.m;
            ekxj.e(audioDeviceCallback);
            c.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }
}
