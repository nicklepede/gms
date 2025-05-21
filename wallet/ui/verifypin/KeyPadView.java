package com.google.android.gms.wallet.ui.verifypin;

import android.accounts.Account;
import android.content.Context;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.ui.verifypin.KeyPadView;
import defpackage.djim;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class KeyPadView extends LinearLayout {
    public djim a;

    public KeyPadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.wallet_view_keypad, (ViewGroup) this, true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: djii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                djim djimVar = KeyPadView.this.a;
                if (djimVar == null) {
                    return;
                }
                int charAt = ((TextView) view).getText().charAt(0) - '0';
                if (djimVar.c.length() < 4) {
                    djimVar.d.setVisibility(4);
                    djimVar.c.append(charAt);
                    djimVar.i.c(djimVar.c.length());
                    if (djimVar.c.length() == 4) {
                        djimVar.m(false);
                        djimVar.i.b(1);
                        String sb = djimVar.c.toString();
                        Account j = djimVar.j();
                        int i = djimVar.f;
                        djimVar.f = i + 1;
                        ReauthProofTokenRequest reauthProofTokenRequest = new ReauthProofTokenRequest(j, sb, 2, i);
                        djimVar.e = efat.n(djimVar.b, 6);
                        djimVar.k().b.m(reauthProofTokenRequest);
                    }
                }
            }
        };
        findViewById(R.id.keypad_button_0).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_1).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_2).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_3).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_4).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_5).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_6).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_7).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_8).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_9).setOnClickListener(onClickListener);
        ((ImageButton) findViewById(R.id.keypad_button_back)).setOnClickListener(new View.OnClickListener() { // from class: djij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                djim djimVar = KeyPadView.this.a;
                if (djimVar.c.length() > 0) {
                    djimVar.d.setVisibility(4);
                    djimVar.c.deleteCharAt(r0.length() - 1);
                    djimVar.i.c(djimVar.c.length());
                }
            }
        });
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn() || Settings.Secure.getInt(getContext().getContentResolver(), "speak_password", 0) != 0) {
            return;
        }
        findViewById(R.id.keypad_button_0).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_1).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_2).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_3).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_4).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_5).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_6).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_7).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_8).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_9).setContentDescription(getResources().getString(R.string.wallet_dot_active));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        findViewById(R.id.keypad_button_0).setEnabled(z);
        findViewById(R.id.keypad_button_1).setEnabled(z);
        findViewById(R.id.keypad_button_2).setEnabled(z);
        findViewById(R.id.keypad_button_3).setEnabled(z);
        findViewById(R.id.keypad_button_4).setEnabled(z);
        findViewById(R.id.keypad_button_5).setEnabled(z);
        findViewById(R.id.keypad_button_6).setEnabled(z);
        findViewById(R.id.keypad_button_7).setEnabled(z);
        findViewById(R.id.keypad_button_8).setEnabled(z);
        findViewById(R.id.keypad_button_9).setEnabled(z);
        ImageButton imageButton = (ImageButton) findViewById(R.id.keypad_button_back);
        imageButton.setEnabled(z);
        if (z) {
            imageButton.clearColorFilter();
        } else {
            imageButton.setColorFilter(-7829368, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
