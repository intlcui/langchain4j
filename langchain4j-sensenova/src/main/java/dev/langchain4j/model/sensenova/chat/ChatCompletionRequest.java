package dev.langchain4j.model.sensenova.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder(toBuilder = true)
public final class ChatCompletionRequest {

	private String model;

	/**
	 * The maximum number of tokens expected to be generated by the model
	 */
	@SerializedName("max_new_tokens")
	private int maxNewTokens;

	private List<Message> messages;

	/**
	 * List of knowledge bases to be searched
	 */
	@SerializedName("know_ids")
	private List<String> knowIds;

	/**
	 * Duplication penalty coefficient, 1 means no penalty,
	 * greater than 1 tends to generate non-duplicate tokens,
	 * less than 1 tends to generate duplicate tokens,
	 * the recommended range is [1,1.2]
	 */
	@SerializedName("repetition_penalty")
	private Double repetitionPenalty;

	/**
	 * Whether to use streaming
	 */
	private boolean stream;

	private Double temperature;

	@SerializedName("top_p")
	private Double topP;

	@SerializedName("knowledge_config")
	private KnowledgeConfig knowledgeConfig;

	/**
	 * Plug-in configuration.
	 * This parameter is not supported when using some models, please refer to the model list for details.
	 */
	private Plugins plugins;

	/**
	 * External user ID.
	 * Application developers can pass in the application system user ID to facilitate tracking.
	 */
	private String user;

	private List<Tool> tools;

	@SerializedName("tool_choice")
	private ToolChoice toolChoice;

	@SerializedName("character_settings")
	private List<CharacterSetting> characterSettings;

	@SerializedName("role_setting")
	private CharacterRoleSetting roleSetting;

	private String extra;

}